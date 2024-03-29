/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	identConstant:expr -> valor:String

public class IdentConstant extends AbstractExpr {

	public IdentConstant(String valor) {
		this.valor = valor;
	}

	public IdentConstant(Object valor) {
		this.valor = (valor instanceof Token) ? ((Token) valor).getText() : (String) valor;

		// Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
		// Obtiene la linea/columna a partir de las de los hijos.
		setPositions(valor);
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	private String valor;
	private DefVariable definicion;

	public DefVariable getDefinicion() {
		return definicion;
	}

	public void setDefinicion(DefVariable definicion) {
		this.definicion = definicion;
	}

	public String toString() {
		return "{valor:" + getValor() + "}";
	}
}
