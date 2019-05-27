package semantic;

import ast.*;
import main.*;
import visitor.*;

public class TypeChecking extends DefaultVisitor {

	public TypeChecking(ErrorManager errorManager) {
		this.errorManager = errorManager;
	}

	// class DefFuncion { String nombre; List<Parametro> parametro; Tipo tipo;
	// List<DefVariable> defvariable; List<Sentencia> sentencia; }
	public Object visit(DefFuncion node, Object param) {

		// super.visit(node, param);
		for (Sentencia sentencia : node.getSentencia()) {
			sentencia.setFuncion(node);
		}
		if (node.getParametro() != null) {
			for (Parametro child : node.getParametro()) {
				child.accept(this, param);
				predicado(isSimple(child.getTipo()), "Los parametros deben de ser tipos primitivos", node);
			}
		}
		if (node.getTipo() != null) {
			node.getTipo().accept(this, param);
			predicado(isSimple(node.getTipo()), "Retorno de tipo no simple", node);
		}
		visitChildren(node.getDefvariable(), param);
		visitChildren(node.getSentencia(), param);
		return null;
	}

	// class LlamadaFuncion { String nombre; List<Expr> parametrosOpt; }
	public Object visit(LlamadaFuncion node, Object param) {
		// super.visit(node, param);
		visitChildren(node.getParametrosOpt(), param);

		// Comprobar que el numero de parametros coincide
		predicado(node.getParametrosOpt().size() == node.getDefinicion().getParametro().size(),
				"Numero de argumentos incorrecto", node);

		// parametros
		if (node.getParametrosOpt().size() == node.getDefinicion().getParametro().size()) {
			for (int i = 0; i < node.getParametrosOpt().size(); i++) {
				predicado(
						isIgualTipo(node.getParametrosOpt().get(i).getTipo(),
								node.getDefinicion().getParametro().get(i).getTipo()),
						"Tipo de los parametros no coincide", node);
			}
		}
		return null;
	}

	// class Return { Expr retorno; }
	public Object visit(Return node, Object param) {
		// super.visit(node, param);
		if (node.getRetorno() != null)
			node.getRetorno().accept(this, param);

		if (node.getFuncion().getTipo() == null) {
			predicado(node.getRetorno() == null, "El return no debe tener expresiones en funciones void", node);
		} else {
			predicado(node.getRetorno() != null, "Debe haber un valor de retorno", node);
			if (node.getRetorno() != null) {
				predicado(isIgualTipo(node.getRetorno().getTipo(), node.getFuncion().getTipo()),
						"Tipo de retorno no coincide", node);
			}
		}

		return null;
	}

	// class Cast { Tipo tipo; Expr expr; }
	public Object visit(Cast node, Object param) {

		super.visit(node, param);

		node.setModificable(false);
		predicado(!isIgualTipo(node.getTipo(), node.getValor().getTipo()), "No se puede hacer cast al mismo tipo",
				node);
		predicado(isSimple(node.getTipo()), "No se puede hacer cast a tipos complejos", node.getStart());
		predicado(isSimple(node.getValor().getTipo()), "No se puede hacer cast de tipos complejos", node.getStart());

		return null;
	}

	// class Asignacion { Expr left; Expr right; }
	public Object visit(Asignacion node, Object param) {

		// super.visit(node, param);

		if (node.getLeft() != null)
			node.getLeft().accept(this, param);

		if (node.getRight() != null)
			node.getRight().accept(this, param);

		predicado(isIgualTipo(node.getLeft().getTipo(), node.getRight().getTipo()), "Valores de distinto tipo", node);
		predicado(node.getLeft().isModificable(), "Valor de la izquierda no modificable", node);
		predicado(isSimple(node.getLeft().getTipo()), "Valor de la izquierda debe de ser simple", node);

		return null;
	}

	// class If { Expr condicion; List<Sentencia> verdadero; List<Sentencia> falso;
	// }
	public Object visit(If node, Object param) {

		// super.visit(node, param);

		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);

		predicado(node.getCondicion().getTipo() instanceof IntType, "La condicion debe de ser de tipo entero", node);

		if (node.getVerdadero() != null) {
			for (Sentencia sentencia : node.getVerdadero()) {
				sentencia.setFuncion(node.getFuncion());
				sentencia.accept(this, param);
			}
		}
		if (node.getFalso() != null) {
			for (Sentencia sentencia : node.getFalso()) {
				sentencia.setFuncion(node.getFuncion());
				sentencia.accept(this, param);
			}
		}
		return null;
	}

	// class While { Expr condicion; List<Sentencia> sentencia; }
	public Object visit(While node, Object param) {

		// super.visit(node, param);

		if (node.getCondicion() != null)
			node.getCondicion().accept(this, param);

		predicado(node.getCondicion().getTipo() instanceof IntType, "La condicion debe de ser de tipo entero", node);

		if (node.getSentencia() != null) {
			for (Sentencia sentencia : node.getSentencia()) {
				sentencia.setFuncion(node.getFuncion());
				sentencia.accept(this, param);
			}
		}
		return null;
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
		// super.visit(node, param);
		if (node.getImprime() != null)
			node.getImprime().accept(this, param);

		predicado(isSimple(node.getImprime().getTipo()), "Debe ser tipo simple", node);
		return null;
	}

	// class Read { Expr leer; }
	public Object visit(Read node, Object param) {
		// super.visit(node, param);
		if (node.getLeer() != null)
			node.getLeer().accept(this, param);

		predicado(isSimple(node.getLeer().getTipo()), "Debe ser un tipo simple", node);
		predicado(node.getLeer().isModificable(), "Debe ser modificable", node);

		return null;
	}

	// class ExprAritmetica { Expr left; String operador; Expr right; }
	public Object visit(ExprAritmetica node, Object param) {
		// super.visit(node, param);
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);

		predicado(node.getLeft().getTipo() instanceof IntType || node.getLeft().getTipo() instanceof FloatType,
				"Deben ser tipo entero o real", node);
		predicado(isIgualTipo(node.getLeft().getTipo(), node.getRight().getTipo()), "Deben de ser del mismo tipo",
				node);
		node.setTipo(node.getLeft().getTipo());
		node.setModificable(false);

		return null;
	}

	// class ExprLogica { Expr left; String operador; Expr right; }
	public Object visit(ExprLogica node, Object param) {
		// super.visit(node, param);
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);

		predicado(
				(node.getLeft().getTipo() instanceof IntType)
						&& isIgualTipo(node.getLeft().getTipo(), node.getRight().getTipo()),
				"Deben de ser de tipo entero", node);
		node.setTipo(new IntType());
		node.setModificable(false);

		return null;
	}

	// class OperadorBinarioLogico { Expr left; Expr right; }
	public Object visit(OperadorBinarioLogico node, Object param) {
		// super.visit(node, param);
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);

		predicado(
				(node.getLeft().getTipo() instanceof IntType)
						&& isIgualTipo(node.getLeft().getTipo(), node.getRight().getTipo()),
				"Deben ser de tipo entero", node);
		node.setTipo(new IntType());
		node.setModificable(false);

		return null;
	}

	// class ExprCondicion { Expr left; String operador; Expr right; }
	public Object visit(ExprCondicion node, Object param) {
		// super.visit(node, param);
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);

		predicado(node.getLeft().getTipo() instanceof IntType || node.getLeft().getTipo() instanceof FloatType,
				"Deben ser tipo entero o real", node);
		predicado(isIgualTipo(node.getLeft().getTipo(), node.getRight().getTipo()), "Deben ser del mismo tipo", node);
		node.setTipo(new IntType());
		node.setModificable(false);

		return null;
	}

	// class Not { Expr valor; }
	public Object visit(Not node, Object param) {
		// super.visit(node, param);
		if (node.getValor() != null)
			node.getValor().accept(this, param);

		predicado(node.getValor().getTipo() instanceof IntType, "Deben ser de tipo entero", node);
		node.setTipo(new IntType());
		node.setModificable(false);
		return null;
	}

	// class Array { Expr nombre; Expr valor; }
	public Object visit(Array node, Object param) {
		// super.visit(node, param);
		if (node.getNombre() != null)
			node.getNombre().accept(this, param);
		if (node.getValor() != null)
			node.getValor().accept(this, param);

		predicado(node.getNombre().getTipo() instanceof ArrayType, "Debe ser tipo array", node);
		if (node.getNombre().getTipo() instanceof ArrayType) {
			predicado(node.getValor().getTipo() instanceof IntType, "Debe ser indice entero", node);
			node.setTipo(((ArrayType) node.getNombre().getTipo()).getTipo());
		}
		node.setModificable(true);

		return null;
	}

	// class AccesoStruct { Expr nombre; String acceso; }
	public Object visit(AccesoStruct node, Object param) {
		super.visit(node, param);
		predicado(node.getNombre().getTipo() instanceof IdentType, "Se requiere tipo Struct", node);
		node.setModificable(true);

		if (node.getNombre().getTipo() instanceof IdentType) {
			IdentType st = (IdentType) node.getNombre().getTipo();
			DefStruct s = (DefStruct) st.getDefinicion();
			for (Campo c : s.getCampo()) {
				if (c.getNombre().equals(node.getAcceso())) {
					node.setTipo(c.getTipo());
				}
			}
			predicado(node.getTipo() != null, "Campo no definido", node.getStart());
		}
		return null;
	}

	// class LlamFuncExp { String nombre; List<Expr> parametrosOpt; }
	public Object visit(LlamFuncExp node, Object param) {
		// super.visit(node, param);
		visitChildren(node.getParametrosOpt(), param);

		// Comprobar si tiene tipo de retorno
		predicado(node.getDefinicion().getTipo() != null, "No tiene tipo de retorno", node);
		// Comprobar que el numero de parametros coincide
		predicado(node.getParametrosOpt().size() == node.getDefinicion().getParametro().size(),
				"Numero de argumentos incorrecto", node);

		// parametros
		if (node.getParametrosOpt().size() == node.getDefinicion().getParametro().size()) {
			for (int i = 0; i < node.getParametrosOpt().size(); i++) {
				predicado(
						isIgualTipo(node.getParametrosOpt().get(i).getTipo(),
								node.getDefinicion().getParametro().get(i).getTipo()),
						"Tipo de los parametros no coincide", node);
			}
		}
		node.setTipo(node.getDefinicion().getTipo());
		node.setModificable(false);
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
		return tipo instanceof CharType || tipo instanceof IntType || tipo instanceof FloatType;
	}

	private boolean isIgualTipo(Tipo tipo1, Tipo tipo2) {
		return tipo1 != null && tipo2 != null ? tipo1.getClass().isAssignableFrom(tipo2.getClass()) : false;
	}

	private ErrorManager errorManager;
}
