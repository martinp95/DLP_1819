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
		visitChildren(node.getDefinicion(), param);
		return null;
	}

	// class DefFuncion { String nombre; List<Parametro> parametro; Tipo tipo;
	// List<DefVariable> defvariable; List<Sentencia> sentencia; }
	public Object visit(DefFuncion node, Object param) {
		variables.set();
		predicado(funciones.get(node.getNombre()) == null, "Funcion ya definida: " + node.getNombre(), node);
		funciones.put(node.getNombre(), node);
		visitChildren(node.getParametro(), param);
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		visitChildren(node.getDefvariable(), param);
		visitChildren(node.getSentencia(), param);
		variables.reset();
		return null;
	}

	// class LlamFuncExp { String nombre; List<Expr> parametrosOpt; }
	public Object visit(LlamFuncExp node, Object param) {
		predicado(funciones.get(node.getNombre()) != null, "Funcion no definida: " + node.getNombre(), node);
		node.setDefinicion(funciones.get(node.getNombre()));
		visitChildren(node.getParametrosOpt(), param);
		return null;
	}

	// class LlamadaFuncion { String nombre; List<Expr> parametrosOpt; }
	public Object visit(LlamadaFuncion node, Object param) {
		predicado(funciones.get(node.getNombre()) != null, "Procedimiento no definido: " + node.getNombre(), node);
		node.setDefinicion(funciones.get(node.getNombre()));
		visitChildren(node.getParametrosOpt(), param);
		return null;
	}

	// class DefStruct { String nombre; List<Campo> campo; }
	public Object visit(DefStruct node, Object param) {
		predicado(structs.get(node.getNombre()) == null, "Estructura repetida definido: " + node.getNombre(), node);
		structs.put(node.getNombre(), node);
		for (Campo campo : node.getCampo()) {
			campo.setDefinicion(node);
			campos.put(campo.getNombre(), campo);
		}
		visitChildren(node.getCampo(), param);
		return null;
	}

	// class Campo { String nombre; Tipo tipo; }
	public Object visit(Campo node, Object param) {
		campos.remove(node.getNombre(), node);
		predicado(campos.get(node.getNombre()) == null, "Campo repetido: " + node.getNombre(), node);
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);
		return null;
	}

	// class IdentType { String nombre; }
	public Object visit(IdentType node, Object param) {
		predicado(structs.get(node.getNombre()) != null, "Estructura no definida: " + node.getNombre(), node);
		node.setDefinicion(structs.get(node.getNombre()));
		return null;
	}

	// class DefVariable { String nombre; Tipo tipo; String ambito; }
	public Object visit(DefVariable node, Object param) {
		predicado(variables.getFromTop(node.getNombre()) == null, "Variable ya definida: " + node.getNombre(), node);
		variables.put(node.getNombre(), node);
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		return null;
	}

	// class Parametro { String nombre; Tipo tipo; }
	public Object visit(Parametro node, Object param) {
		DefVariable variable = new DefVariable(node.getNombre(), node.getTipo(), "param");
		variable.setParametro(node);
		variable.setReferencia(true);
		predicado(variables.getFromTop(variable.getNombre()) == null, "parametro repetido: " + variable.getNombre(),
				node);
		variables.put(variable.getNombre(), variable);
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		return null;
	}

	// class IdentConstant { String valor; }
	public Object visit(IdentConstant node, Object param) {
		predicado(variables.getFromAny(node.getValor()) != null, "Variable no definida: " + node.getValor(), node);
		node.setDefinicion(variables.getFromAny(node.getValor()));
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
			errorManager.notify("Identificacion", mensajeError, posicionError);
	}

	private void predicado(boolean condicion, String mensajeError, AST node) {
		predicado(condicion, mensajeError, node.getStart());
	}

	private ErrorManager errorManager;
	private Map<String, DefFuncion> funciones = new HashMap<String, DefFuncion>();
	private Map<String, DefStruct> structs = new HashMap<String, DefStruct>();
	private Map<String, Campo> campos = new HashMap<String, Campo>();
	private ContextMap<String, DefVariable> variables = new ContextMap<String, DefVariable>();
}
