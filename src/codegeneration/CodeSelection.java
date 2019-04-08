package codegeneration;

import java.io.*;
import java.util.*;

import ast.*;
import visitor.*;

public class CodeSelection extends DefaultVisitor {

	enum Funcion {
		DIRECCION, VALOR
	}

	private Map<String, String> instruccion = new HashMap<String, String>();
	private int contadorIfs = 0;
	private int contadorWhile = 0;

	public CodeSelection(Writer writer, String sourceFile) {
		this.writer = new PrintWriter(writer);
		this.sourceFile = sourceFile;

		instruccion.put("+", "ADD");
		instruccion.put("-", "SUB");
		instruccion.put("*", "MUL");
		instruccion.put("/", "DIV");
		instruccion.put("&&", "AND");
		instruccion.put("||", "OR");

		instruccion.put("<", "LT");
		instruccion.put(">", "GT");
		instruccion.put("==", "EQ");
		instruccion.put("!=", "NE");
		instruccion.put(">=", "GE");
		instruccion.put("<=", "LE");
	}

	// class Programa { List<Definicion> definicion; }
	public Object visit(Programa node, Object param) {
		out("#source \"" + sourceFile + "\"");
		out("call main");
		out("halt");
		visitChildren(node.getDefinicion(), param);
		return null;
	}

	// class DefFuncion { String nombre; List<Parametro> parametro; Tipo tipo;
	// List<DefVariable> defvariable; List<Sentencia> sentencia; }
	public Object visit(DefFuncion node, Object param) {

		// super.visit(node, param);
		int sizeLocales = 0;
		int sizeParametros = 0;

		out(node.getNombre() + ":");

		if (node.getParametro() != null)
			for (Parametro child : node.getParametro())
				sizeParametros += child.getTipo().getMemSize();

		if (node.getDefvariable() != null)
			for (DefVariable child : node.getDefvariable())
				sizeLocales += child.getTipo().getMemSize();

		out("enter " + sizeLocales);

		if (node.getTipo() == null)
			out("ret 0, " + sizeLocales + ", " + sizeParametros);

		if (node.getSentencia() != null)
			for (Sentencia child : node.getSentencia())
				child.accept(this, param);

		return null;
	}

	// class Print { Expr imprime; String tipoPrint; }
	public Object visit(Print node, Object param) {
		out("#line " + node.getEnd().getLine());
		node.getImprime().accept(this, Funcion.VALOR);
		out("out" + node.getImprime().getTipo().getSufijo());

		return null;
	}

	// class Read { Expr leer; }
	public Object visit(Read node, Object param) {
		out("#line " + node.getEnd().getLine());
		node.getLeer().accept(this, Funcion.DIRECCION);
		out("in" + node.getLeer().getTipo().getSufijo());
		out("store" + node.getLeer().getTipo().getSufijo());
		return null;
	}

	// class Asignacion { Expr left; Expr right; }
	public Object visit(Asignacion node, Object param) {
		out("#line " + node.getEnd().getLine());
		node.getLeft().accept(this, Funcion.DIRECCION);
		node.getRight().accept(this, Funcion.VALOR);
		out("store" + node.getLeft().getTipo().getSufijo());
		return null;
	}

	// class If { Expr condicion; List<Sentencia> verdadero; List<Sentencia> falso;
	// }
	public Object visit(If node, Object param) {
		return null;
	}

	// Método auxiliar recomendado (opcional) -------------
	private void out(String instruction) {
		writer.println(instruction);
	}

	private PrintWriter writer;
	private String sourceFile;
}
