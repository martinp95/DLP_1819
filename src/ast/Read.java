/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	read:sentencia -> leer:expr

public class Read extends AbstractSentencia {

	public Read(Expr leer) {
		this.leer = leer;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(leer);
	}

	public Read(Object leer) {
		this.leer = (Expr) ((leer instanceof ParserRuleContext) ? getAST(leer) : leer);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(leer);
	}

	public Expr getLeer() {
		return leer;
	}
	public void setLeer(Expr leer) {
		this.leer = leer;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr leer;

	public String toString() {
       return "{leer:" + getLeer() + "}";
   }
}
