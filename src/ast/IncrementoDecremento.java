/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	incrementoDecremento:sentencia -> left:expr  operador:String

public class IncrementoDecremento extends AbstractSentencia {

	public IncrementoDecremento(Expr left, String operador) {
		this.left = left;
		this.operador = operador;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(left);
	}

	public IncrementoDecremento(Object left, Object operador) {
		this.left = (Expr) ((left instanceof ParserRuleContext) ? getAST(left) : left);
		this.operador = (operador instanceof Token) ? ((Token)operador).getText() : (String) operador;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(left, operador);
	}

	public Expr getLeft() {
		return left;
	}
	public void setLeft(Expr left) {
		this.left = left;
	}

	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr left;
	private String operador;

	public String toString() {
       return "{left:" + getLeft() + ", operador:" + getOperador() + "}";
   }
}
