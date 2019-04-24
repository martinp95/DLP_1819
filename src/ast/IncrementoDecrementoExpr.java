/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	incrementoDecrementoExpr:expr -> valor:expr  operador:String

public class IncrementoDecrementoExpr extends AbstractExpr {

	public IncrementoDecrementoExpr(Expr valor, String operador) {
		this.valor = valor;
		this.operador = operador;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(valor);
	}

	public IncrementoDecrementoExpr(Object valor, Object operador) {
		this.valor = (Expr) ((valor instanceof ParserRuleContext) ? getAST(valor) : valor);
		this.operador = (operador instanceof Token) ? ((Token)operador).getText() : (String) operador;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(valor, operador);
	}

	public Expr getValor() {
		return valor;
	}
	public void setValor(Expr valor) {
		this.valor = valor;
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

	private Expr valor;
	private String operador;

	public String toString() {
       return "{valor:" + getValor() + ", operador:" + getOperador() + "}";
   }
}
