package semantic;

import java.util.*;

import ast.*;
import main.*;
import visitor.*;

public class Identification extends DefaultVisitor {

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

//	class Programa { List<Definicion> definicion; }
	public Object visit(Programa node, Object param) {

		// super.visit(node, param);

		if (node.getDefinicion() != null)
			for (Definicion child : node.getDefinicion())
				child.accept(this, param);

		return null;
	}

	//	class DefVariable { String nombre;  Tipo tipo;  String ambito; }
	public Object visit(DefVariable node, Object param) {

		// super.visit(node, param);

		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		return null;
	}

	//	class DefStruct { String nombre;  List<Campo> campo; }
	public Object visit(DefStruct node, Object param) {

		// super.visit(node, param);

		if (node.getCampo() != null)
			for (Campo child : node.getCampo())
				child.accept(this, param);

		return null;
	}

	//	class DefFuncion { String nombre;  List<Parametro> parametro;  Tipo tipo;  List<DefVariable> defvariable;  List<Sentencia> sentencia; }
	public Object visit(DefFuncion node, Object param) {

		// super.visit(node, param);
		
		predicado(funciones.get(node.getNombre())==null, "Funcion ya definida", node);
		funciones.put(node.getNombre(), node);

		if (node.getParametro() != null)
			for (Parametro child : node.getParametro())
				child.accept(this, param);

		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		if (node.getDefvariable() != null)
			for (DefVariable child : node.getDefvariable())
				child.accept(this, param);

		if (node.getSentencia() != null)
			for (Sentencia child : node.getSentencia())
				child.accept(this, param);

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

		// super.visit(node, param);

		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		return null;
	}

	//	class Campo { String nombre;  Tipo tipo; }
	public Object visit(Campo node, Object param) {

		// super.visit(node, param);

		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		return null;
	}

	//	class Parametro { String nombre;  Tipo tipo; }
	public Object visit(Parametro node, Object param) {

		// super.visit(node, param);

		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		return null;
	}

	//	class Print { Expr imprime;  String tipoPrint; }
	public Object visit(Print node, Object param) {

		// super.visit(node, param);

		if (node.getImprime() != null)
			node.getImprime().accept(this, param);

		return null;
	}

	//	class Read { Expr leer; }
	public Object visit(Read node, Object param) {

		// super.visit(node, param);

		if (node.getLeer() != null)
			node.getLeer().accept(this, param);

		return null;
	}

	//	class Asignacion { Expr left;  Expr right; }
	public Object visit(Asignacion node, Object param) {

		// super.visit(node, param);

		if (node.getLeft() != null)
			node.getLeft().accept(this, param);

		if (node.getRight() != null)
			node.getRight().accept(this, param);

		return null;
	}

	//	class If { Expr condicion;  List<Sentencia> verdadero;  List<Sentencia> falso; }
	public Object visit(If node, Object param) {

		// super.visit(node, param);

		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);

		if (node.getVerdadero() != null)
			for (Sentencia child : node.getVerdadero())
				child.accept(this, param);

		if (node.getFalso() != null)
			for (Sentencia child : node.getFalso())
				child.accept(this, param);

		return null;
	}

	//	class While { Expr condicion;  List<Sentencia> sentencia; }
	public Object visit(While node, Object param) {

		// super.visit(node, param);

		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);

		if (node.getSentencia() != null)
			for (Sentencia child : node.getSentencia())
				child.accept(this, param);

		return null;
	}

	//	class LlamadaFuncion { String nombre;  List<Expr> parametrosOpt; }
	public Object visit(LlamadaFuncion node, Object param) {

		// super.visit(node, param);
		predicado(funciones.get(node.getNombre())!=null, "Procedimiento no definido", node);
		node.setDefinicion(funciones.get(node.getNombre()));

		if (node.getParametrosOpt() != null)
			for (Expr child : node.getParametrosOpt())
				child.accept(this, param);

		return null;
	}

	//	class Return { Expr retorno; }
	public Object visit(Return node, Object param) {

		// super.visit(node, param);

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

		// super.visit(node, param);

		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		if (node.getValor() != null)
			node.getValor().accept(this, param);

		return null;
	}

	//	class ExprAritmetica { Expr left;  String operador;  Expr right; }
	public Object visit(ExprAritmetica node, Object param) {

		// super.visit(node, param);

		if (node.getLeft() != null)
			node.getLeft().accept(this, param);

		if (node.getRight() != null)
			node.getRight().accept(this, param);

		return null;
	}

	//	class ExprLogica { Expr left;  String operador;  Expr right; }
	public Object visit(ExprLogica node, Object param) {

		// super.visit(node, param);

		if (node.getLeft() != null)
			node.getLeft().accept(this, param);

		if (node.getRight() != null)
			node.getRight().accept(this, param);

		return null;
	}

	//	class Not { Expr valor; }
	public Object visit(Not node, Object param) {

		// super.visit(node, param);

		if (node.getValor() != null)
			node.getValor().accept(this, param);

		return null;
	}

	//	class Array { Expr nombre;  Expr valor; }
	public Object visit(Array node, Object param) {

		// super.visit(node, param);

		if (node.getNombre() != null)
			node.getNombre().accept(this, param);

		if (node.getValor() != null)
			node.getValor().accept(this, param);

		return null;
	}

	//	class AccesoStruct { Expr nombre;  String acceso; }
	public Object visit(AccesoStruct node, Object param) {

		// super.visit(node, param);

		if (node.getNombre() != null)
			node.getNombre().accept(this, param);

		return null;
	}

	//	class LlamFuncExp { String nombre;  List<Expr> parametrosOpt; }
	public Object visit(LlamFuncExp node, Object param) {

		// super.visit(node, param);		
		predicado(funciones.get(node.getNombre())!=null, "Funcion no definida", node);
		node.setDefinicion(funciones.get(node.getNombre()));

		if (node.getParametrosOpt() != null)
			for (Expr child : node.getParametrosOpt())
				child.accept(this, param);

		return null;
	}

    /**
     * predicado. Método auxiliar para implementar los predicados. Borrar si no se quiere usar.
     *
     * Ejemplos de uso (suponiendo que existe un método "esPrimitivo"):
     *
     *      1. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo pimitivo", expr.getStart());
     *      2. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo pimitivo", expr);
     *      3. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo primitivo");
     *
     * NOTA: El método getStart() (ejemplo 1) indica la linea/columna del fichero fuente donde estaba el nodo
     * (y así poder dar información más detallada de la posición del error). Si se usa VGen, dicho método
     * habrá sido generado en todos los nodos del AST.
     * No es obligatorio llamar a getStart() (ejemplo 2), ya que si se pasa el nodo, se usará por defecto dicha
     * posición.
     * Si no se quiere imprimir la posición del fichero, se puede omitir el tercer argumento (ejemplo 3).
     *
     * @param condicion     Debe cumplirse para que no se produzca un error
     * @param mensajeError  Se imprime si no se cumple la condición
     * @param posicionError Fila y columna del fichero donde se ha producido el error.
     */
    private void predicado(boolean condicion, String mensajeError, Position posicionError) {
        if (!condicion)
            errorManager.notify("Identificacion", mensajeError, posicionError);
    }

    private void predicado(boolean condicion, String mensajeError, AST node) {
        predicado(condicion, mensajeError, node.getStart());
    }

    private void predicado(boolean condicion, String mensajeError) {
        predicado(condicion, mensajeError, (Position) null);
    }


    private ErrorManager errorManager;
    private Map<String, DefFuncion> funciones = new HashMap<String, DefFuncion>();
}
