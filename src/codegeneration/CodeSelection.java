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
		out("#line " + node.getEnd().getLine());
		int contadorIfs = this.contadorIfs;
		this.contadorIfs++;
		node.getCondicion().accept(this, Funcion.VALOR);
		if (node.getFalso() != null)
			out("jz else" + contadorIfs);
		else
			out("jz finElse" + contadorIfs);

		visitChildren(node.getVerdadero(), param);
		if (node.getVerdadero() != null) {
			out("jmp finElse" + contadorIfs);
			out("else" + contadorIfs + ":");
			visitChildren(node.getFalso(), param);
		}

		if (node.getFalso() != null)
			out("finElse" + contadorIfs + ":");
		else
			out("else" + contadorIfs + ":");
		return null;
	}

	// class While { Expr condicion; List<Sentencia> sentencia; }
	public Object visit(While node, Object param) {
		out("#line " + node.getCondicion().getStart().getLine());
		int contadorWhile = this.contadorWhile;
		this.contadorWhile++;
		out("while" + contadorWhile + ":");
		node.getCondicion().accept(this, Funcion.VALOR);
		out("jz finWhile" + contadorWhile);
		visitChildren(node.getSentencia(), param);
		out("jmp while" + contadorWhile);
		out("finWhile" + contadorWhile + ":");
		return null;
	}

	// class LlamadaFuncion { String nombre; List<Expr> parametrosOpt; }
	public Object visit(LlamadaFuncion node, Object param) {
		if (node.getParametrosOpt() != null)
			visitChildren(node.getParametrosOpt(), Funcion.VALOR);
		out("call " + node.getNombre());
		if (node.getDefinicion().getTipo() != null)
			out("pop" + node.getDefinicion().getTipo().getSufijo());
		return null;
	}

	// class Return { Expr retorno; }
	public Object visit(Return node, Object param) {
		int sizeLocales = 0;
		int sizeParametros = 0;

		for (Parametro child : node.getFuncion().getParametro())
			sizeParametros += child.getTipo().getMemSize();
		for (DefVariable child : node.getFuncion().getDefvariable())
			sizeLocales += child.getTipo().getMemSize();

		if (node.getRetorno() == null)
			out("ret 0," + sizeLocales + "," + sizeParametros);
		else {
			node.getRetorno().accept(this, Funcion.VALOR);
			out("ret" + node.getRetorno().getTipo().getMemSize() + "," + sizeLocales + "," + sizeParametros);
		}
		return null;
	}

	// class IntConstant { String valor; }
	public Object visit(IntConstant node, Object param) {
		out("pushi " + node.getValor());
		return null;
	}

	// class RealConstant { String valor; }
	public Object visit(RealConstant node, Object param) {
		out("pushf " + node.getValor());
		return null;
	}

	// class CharConstant { String valor; }
	public Object visit(CharConstant node, Object param) {
		out("pushb " + node.getValor());
		return null;
	}

	// Método auxiliar recomendado (opcional) -------------
	private void out(String instruction) {
		writer.println(instruction);
	}

	private PrintWriter writer;
	private String sourceFile;
}
