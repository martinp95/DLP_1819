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

		instruccion.put("+", "add");
		instruccion.put("-", "sub");
		instruccion.put("*", "mul");
		instruccion.put("/", "div");
		instruccion.put("&&", "and");
		instruccion.put("||", "or");

		instruccion.put("<", "lt");
		instruccion.put(">", "gt");
		instruccion.put("==", "eq");
		instruccion.put("!=", "ne");
		instruccion.put(">=", "ge");
		instruccion.put("<=", "le");
	}

	// class Programa { List<Definicion> definicion; }
	public Object visit(Programa node, Object param) {
		out("#source \"" + sourceFile + "\"");
		out("call main");
		out("halt");
		visitChildren(node.getDefinicion(), param);
		return null;
	}

//  class Campo { String nombre;  Tipo tipo; }
	public Object visit(Campo node, Object param) {
		out("push " + node.getDireccion());
		return null;
	}

	// class DefVariable { String nombre; Tipo tipo; String ambito; }
	public Object visit(DefVariable node, Object param) {
		out("#GLOBAL " + node.getNombre() + ":" + node.getTipo().getNombreMAPL());
		return null;
	}

	// class DefStruct { String nombre; List<Campo> campo; }
	public Object visit(DefStruct node, Object param) {
		out("#TYPE " + node.getNombre() + ":" + "{");
		for (Campo c : node.getCampo()) {
			out(c.getNombre() + ":" + c.getTipo().getNombreMAPL());
		}
		out("}");
		return null;
	}

	// class DefFuncion { String nombre; List<Parametro> parametro; Tipo tipo;
	// List<DefVariable> defvariable; List<Sentencia> sentencia; }
	public Object visit(DefFuncion node, Object param) {
		out("#line " + node.getStart().getLine());
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

		if (node.getSentencia() != null)
			for (Sentencia child : node.getSentencia())
				child.accept(this, param);

		if (node.getTipo() == null)
			out("ret 0, " + sizeLocales + ", " + sizeParametros);

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
		// super.visit(node, param);
		node.getCondicion().accept(this, Funcion.VALOR);

		if (node.getFalso() != null) {
			out("jz else" + contadorIfs);
		} else {
			out("jz finif" + contadorIfs);
		}

		for (int i = 0; i < node.getVerdadero().size(); i++) {
			node.getVerdadero().get(i).accept(this, param);
			if (i == node.getVerdadero().size() - 1 && !(node.getVerdadero().get(i) instanceof Return)) {
				out("jmp finif" + contadorIfs);
			}
		}

		if (node.getFalso() != null) {
			out("else" + contadorIfs + ":");
			for (Sentencia child : node.getFalso())
				child.accept(this, param);
		}
		out("finif" + contadorIfs + ":");
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
			out("pop");
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
			out("ret " + node.getRetorno().getTipo().getMemSize() + "," + sizeLocales + "," + sizeParametros);
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
		if ("'\\n'".equals(node.getValor()))
			out("pushb 10");
		else
			out("pushb " + (int) node.getValor().charAt(1));
		return null;
	}

	// class IdentConstant { String valor; }
	public Object visit(IdentConstant node, Object param) {
		if (Funcion.DIRECCION.equals(param)) {
			if (node.getDefinicion().getAmbito().equals("global")) {
				out("pusha " + node.getDefinicion().getDireccion());
			} else if (node.getDefinicion().getAmbito().equals("param")) {
				out("pusha BP");
				out("push " + node.getDefinicion().getParametro().getDireccion());
				out("add");
			} else if (node.getDefinicion().getAmbito().equals("local")) {
				out("pusha BP");
				out("push " + node.getDefinicion().getDireccion());
				out("add");
			}
		}
		if (Funcion.VALOR.equals(param)) {
			visit(node, Funcion.DIRECCION);
			out("load" + node.getDefinicion().getTipo().getSufijo());
		}
		return null;
	}

	// class Cast { Tipo tipo; Expr valor; }
	public Object visit(Cast node, Object param) {
		node.getTipo().accept(this, param);
		node.getValor().accept(this, Funcion.VALOR);
		out(node.getValor().getTipo().getSufijo() + "2" + node.getTipo().getSufijo());
		return null;
	}

	// class ExprAritmetica { Expr left; String operador; Expr right; }
	public Object visit(ExprAritmetica node, Object param) {
		node.getLeft().accept(this, Funcion.VALOR);
		node.getRight().accept(this, Funcion.VALOR);
		out(instruccion.get(node.getOperador()) + node.getLeft().getTipo().getSufijo());

		return null;
	}

	// class ExprLogica { Expr left; String operador; Expr right; }
	public Object visit(ExprLogica node, Object param) {
		node.getLeft().accept(this, Funcion.VALOR);
		node.getRight().accept(this, Funcion.VALOR);
		out(instruccion.get(node.getOperador()));
		return null;
	}

	// class ExprCondicion { Expr left; String operador; Expr right; }
	public Object visit(ExprCondicion node, Object param) {
		node.getLeft().accept(this, param);
		node.getRight().accept(this, param);
		out(instruccion.get(node.getOperador()) + node.getLeft().getTipo().getSufijo());
		return null;
	}

	// class Not { Expr valor; }
	public Object visit(Not node, Object param) {
		if (node.getValor() != null)
			node.getValor().accept(this, Funcion.VALOR);
		out("not");
		return null;
	}

	// class Array { Expr nombre; Expr valor; }
	public Object visit(Array node, Object param) {
		node.getNombre().accept(this, Funcion.DIRECCION);
		out("push " + ((ArrayType) (node.getNombre().getTipo())).getTipo().getMemSize());
		node.getValor().accept(this, Funcion.VALOR);
		out("mul");
		out("add");

		if (Funcion.VALOR.equals(param))
			out("load" + ((ArrayType) node.getNombre().getTipo()).getTipo().getSufijo());

		return null;
	}

	// class AccesoStruct { Expr nombre; String acceso; }
	public Object visit(AccesoStruct node, Object param) {
		if (Funcion.VALOR.equals(param)) {
			node.accept(this, Funcion.DIRECCION);
			out("load" + node.getTipo().getSufijo());
		} else {
			node.getNombre().accept(this, Funcion.DIRECCION);
			List<Campo> lista = ((IdentType) (node.getNombre()).getTipo()).getDefinicion().getCampo();
			for (Campo c : lista) {
				if (c.getNombre().equals(node.getAcceso())) {
					out("push " + c.getDireccion());
				}
			}
			out("add");
		}
		return null;
	}

	// class LlamFuncExp { String nombre; List<Expr> parametrosOpt; }
	public Object visit(LlamFuncExp node, Object param) {
		if (node.getParametrosOpt() != null)
			visitChildren(node.getParametrosOpt(), Funcion.VALOR);
		out("call " + node.getNombre());
		return null;
	}

	// Método auxiliar recomendado (opcional) -------------
	private void out(String instruction) {
		writer.println(instruction);
	}

	private PrintWriter writer;
	private String sourceFile;
}
