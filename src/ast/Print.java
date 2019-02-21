/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	print:sentencia -> imprime:expr  tipoPrint:String

public class Print extends AbstractSentencia {

	public Print(Expr imprime, String tipoPrint) {
		this.imprime = imprime;
		this.tipoPrint = tipoPrint;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(imprime);
	}

	public Print(Object imprime, Object tipoPrint) {
		this.imprime = (Expr) ((imprime instanceof ParserRuleContext) ? getAST(imprime) : imprime);
		this.tipoPrint = (tipoPrint instanceof Token) ? ((Token)tipoPrint).getText() : (String) tipoPrint;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(imprime, tipoPrint);
	}

	public Expr getImprime() {
		return imprime;
	}
	public void setImprime(Expr imprime) {
		this.imprime = imprime;
	}

	public String getTipoPrint() {
		return tipoPrint;
	}
	public void setTipoPrint(String tipoPrint) {
		this.tipoPrint = tipoPrint;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr imprime;
	private String tipoPrint;

	public String toString() {
       return "{imprime:" + getImprime() + ", tipoPrint:" + getTipoPrint() + "}";
   }
}
