/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package visitor;

import ast.*;
import java.util.*;

/*
DefaultVisitor. Implementación base del visitor para ser derivada por nuevos visitor.
	No modificar esta clase. Para crear nuevos visitor usar el fichero "_PlantillaParaVisitors.txt".
	DefaultVisitor ofrece una implementación por defecto de cada nodo que se limita a visitar los nodos hijos.
*/
public class DefaultVisitor implements Visitor {

	//	class Programa { List<Definicion> definicion; }
	public Object visit(Programa node, Object param) {
		visitChildren(node.getDefinicion(), param);
		return null;
	}

	//	class DefVariable { String nombre;  Tipo tipo;  String ambito; }
	public Object visit(DefVariable node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class DefStruct { String nombre;  List<Campo> campo; }
	public Object visit(DefStruct node, Object param) {
		visitChildren(node.getCampo(), param);
		return null;
	}

	//	class DefFuncion { String nombre;  List<Parametro> parametro;  Tipo tipo;  List<DefVariable> defvariable;  List<Sentencia> sentencia; }
	public Object visit(DefFuncion node, Object param) {
		visitChildren(node.getParametro(), param);
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		visitChildren(node.getDefvariable(), param);
		visitChildren(node.getSentencia(), param);
		return null;
	}

	//	class IntType {  }
	public Object visit(IntType node, Object param) {
		return null;
	}

	//	class FloatType {  }
	public Object visit(FloatType node, Object param) {
		return null;
	}

	//	class CharType {  }
	public Object visit(CharType node, Object param) {
		return null;
	}

	//	class IdentType { String nombre; }
	public Object visit(IdentType node, Object param) {
		return null;
	}

	//	class ArrayType { String posicion;  Tipo tipo; }
	public Object visit(ArrayType node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class Campo { String nombre;  Tipo tipo; }
	public Object visit(Campo node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class Parametro { String nombre;  Tipo tipo; }
	public Object visit(Parametro node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	//	class Print { Expr imprime;  String tipoPrint; }
	public Object visit(Print node, Object param) {
		if (node.getImprime() != null)
			node.getImprime().accept(this, param);
		return null;
	}

	//	class Read { Expr leer; }
	public Object visit(Read node, Object param) {
		if (node.getLeer() != null)
			node.getLeer().accept(this, param);
		return null;
	}

	//	class Asignacion { Expr left;  Expr right; }
	public Object visit(Asignacion node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class If { Expr condicion;  List<Sentencia> verdadero;  List<Sentencia> falso; }
	public Object visit(If node, Object param) {
		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);
		visitChildren(node.getVerdadero(), param);
		visitChildren(node.getFalso(), param);
		return null;
	}

	//	class While { Expr condicion;  List<Sentencia> sentencia; }
	public Object visit(While node, Object param) {
		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);
		visitChildren(node.getSentencia(), param);
		return null;
	}

	//	class LlamadaFuncion { String nombre;  List<Expr> parametrosOpt; }
	public Object visit(LlamadaFuncion node, Object param) {
		visitChildren(node.getParametrosOpt(), param);
		return null;
	}

	//	class Return { Expr retorno; }
	public Object visit(Return node, Object param) {
		if (node.getRetorno() != null)
			node.getRetorno().accept(this, param);
		return null;
	}

	//	class IntConstant { String valor; }
	public Object visit(IntConstant node, Object param) {
		return null;
	}

	//	class RealConstant { String valor; }
	public Object visit(RealConstant node, Object param) {
		return null;
	}

	//	class CharConstant { String valor; }
	public Object visit(CharConstant node, Object param) {
		return null;
	}

	//	class IdentConstant { String valor; }
	public Object visit(IdentConstant node, Object param) {
		return null;
	}

	//	class Cast { Tipo tipo;  Expr valor; }
	public Object visit(Cast node, Object param) {
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		if (node.getValor() != null)
			node.getValor().accept(this, param);
		return null;
	}

	//	class ExprAritmetica { Expr left;  String operador;  Expr right; }
	public Object visit(ExprAritmetica node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class ExprLogica { Expr left;  String operador;  Expr right; }
	public Object visit(ExprLogica node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class Not { Expr valor; }
	public Object visit(Not node, Object param) {
		if (node.getValor() != null)
			node.getValor().accept(this, param);
		return null;
	}

	//	class Array { Expr nombre;  Expr valor; }
	public Object visit(Array node, Object param) {
		if (node.getNombre() != null)
			node.getNombre().accept(this, param);
		if (node.getValor() != null)
			node.getValor().accept(this, param);
		return null;
	}

	//	class AccesoStruct { Expr nombre;  String acceso; }
	public Object visit(AccesoStruct node, Object param) {
		if (node.getNombre() != null)
			node.getNombre().accept(this, param);
		return null;
	}

	//	class LlamFuncExp { String nombre;  List<Expr> parametrosOpt; }
	public Object visit(LlamFuncExp node, Object param) {
		visitChildren(node.getParametrosOpt(), param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
