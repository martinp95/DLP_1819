package semantic;

import ast.*;
import main.*;
import visitor.*;

public class TypeChecking extends DefaultVisitor {

	public TypeChecking(ErrorManager errorManager) {
		this.errorManager = errorManager;
	}

	// class IntConstant { String valor; }
	public Object visit(IntConstant node, Object param) {
		node.setModificable(false);
		node.setTipo(new IntType());
		return null;
	}

	// class RealConstant { String valor; }
	public Object visit(RealConstant node, Object param) {
		node.setModificable(false);
		node.setTipo(new FloatType());
		return null;
	}

	// class CharConstant { String valor; }
	public Object visit(CharConstant node, Object param) {
		node.setModificable(false);
		node.setTipo(new CharType());
		return null;
	}

	// class IdentConstant { String valor; }
	public Object visit(IdentConstant node, Object param) {
		node.setModificable(true);
		node.setTipo(node.getDefinicion().getTipo());
		return null;
	}

	// class Print { Expr imprime; String tipoPrint; }
	public Object visit(Print node, Object param) {

		super.visit(node, param);
		if (node.getImprime() instanceof LlamFuncExp) {
			predicado(node.getImprime().getTipo() != null, "La funcion debe retornar algo", node);
		} else {
			predicado(isSimple(node.getImprime().getTipo()), "Debe de ser un tipo simple", node);
		}
		return null;
	}

	// class Read { Expr leer; }
	public Object visit(Read node, Object param) {

		super.visit(node, param);
		predicado(isSimple(node.getLeer().getTipo()), "Debe de ser de tipo simple", node);
		predicado(node.getLeer().isModificable(), "Debe de ser modificable", node);

		return null;
	}

	/**
	 * predicado. Método auxiliar para implementar los predicados. Borrar si no se
	 * quiere usar.
	 *
	 * Ejemplos de uso (suponiendo que existe un método "esPrimitivo"):
	 *
	 * 1. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo
	 * pimitivo", expr.getStart()); 2. predicado(esPrimitivo(expr.tipo), "La
	 * expresión debe ser de un tipo pimitivo", expr); 3.
	 * predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo
	 * primitivo");
	 *
	 * NOTA: El método getStart() (ejemplo 1) indica la linea/columna del fichero
	 * fuente donde estaba el nodo (y así poder dar información más detallada de la
	 * posición del error). Si se usa VGen, dicho método habrá sido generado en
	 * todos los nodos del AST. No es obligatorio llamar a getStart() (ejemplo 2),
	 * ya que si se pasa el nodo, se usará por defecto dicha posición. Si no se
	 * quiere imprimir la posición del fichero, se puede omitir el tercer argumento
	 * (ejemplo 3).
	 *
	 * @param condicion     Debe cumplirse para que no se produzca un error
	 * @param mensajeError  Se imprime si no se cumple la condición
	 * @param posicionError Fila y columna del fichero donde se ha producido el
	 *                      error.
	 */
	private void predicado(boolean condicion, String mensajeError, Position posicionError) {
		if (!condicion)
			errorManager.notify("Comprobación de tipos", mensajeError, posicionError);
	}

	private void predicado(boolean condicion, String mensajeError, AST node) {
		predicado(condicion, mensajeError, node.getStart());
	}

	private boolean isSimple(Tipo tipo) {
		return tipo instanceof CharType || tipo instanceof IntType || tipo instanceof FloatType || tipo == null;
	}

	private boolean isIgualTipo(Tipo tipo1, Tipo tipo2) {
		return tipo1 != null && tipo2 != null ? tipo1.getClass().isAssignableFrom(tipo2.getClass()) : false;
	}

	private ErrorManager errorManager;
}
