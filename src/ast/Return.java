/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	return:sentencia -> retorno:expr

public class Return extends AbstractSentencia {

	public Return(Expr retorno) {
		this.retorno = retorno;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(retorno);
	}

	public Return(Object retorno) {
		this.retorno = (Expr) ((retorno instanceof ParserRuleContext) ? getAST(retorno) : retorno);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(retorno);
	}

	public Expr getRetorno() {
		return retorno;
	}
	public void setRetorno(Expr retorno) {
		this.retorno = retorno;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr retorno;

	public String toString() {
       return "{retorno:" + getRetorno() + "}";
   }
}
