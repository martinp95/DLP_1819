/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	operadorTernario:expr -> condicion:expr  verdadero:expr  falso:expr

public class OperadorTernario extends AbstractExpr {

	public OperadorTernario(Expr condicion, Expr verdadero, Expr falso) {
		this.condicion = condicion;
		this.verdadero = verdadero;
		this.falso = falso;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, verdadero, falso);
	}

	public OperadorTernario(Object condicion, Object verdadero, Object falso) {
		this.condicion = (Expr) ((condicion instanceof ParserRuleContext) ? getAST(condicion) : condicion);
		this.verdadero = (Expr) ((verdadero instanceof ParserRuleContext) ? getAST(verdadero) : verdadero);
		this.falso = (Expr) ((falso instanceof ParserRuleContext) ? getAST(falso) : falso);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, verdadero, falso);
	}

	public Expr getCondicion() {
		return condicion;
	}
	public void setCondicion(Expr condicion) {
		this.condicion = condicion;
	}

	public Expr getVerdadero() {
		return verdadero;
	}
	public void setVerdadero(Expr verdadero) {
		this.verdadero = verdadero;
	}

	public Expr getFalso() {
		return falso;
	}
	public void setFalso(Expr falso) {
		this.falso = falso;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr condicion;
	private Expr verdadero;
	private Expr falso;

	public String toString() {
       return "{condicion:" + getCondicion() + ", verdadero:" + getVerdadero() + ", falso:" + getFalso() + "}";
   }
}
