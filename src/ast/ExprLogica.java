/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	exprLogica:expr -> left:expr  operador:String  right:expr

public class ExprLogica extends AbstractExpr {

	public ExprLogica(Expr left, String operador, Expr right) {
		this.left = left;
		this.operador = operador;
		this.right = right;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(left, right);
	}

	public ExprLogica(Object left, Object operador, Object right) {
		this.left = (Expr) ((left instanceof ParserRuleContext) ? getAST(left) : left);
		this.operador = (operador instanceof Token) ? ((Token)operador).getText() : (String) operador;
		this.right = (Expr) ((right instanceof ParserRuleContext) ? getAST(right) : right);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(left, operador, right);
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

	public Expr getRight() {
		return right;
	}
	public void setRight(Expr right) {
		this.right = right;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr left;
	private String operador;
	private Expr right;

	public String toString() {
       return "{left:" + getLeft() + ", operador:" + getOperador() + ", right:" + getRight() + "}";
   }
}
