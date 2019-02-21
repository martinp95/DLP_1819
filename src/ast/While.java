/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	while:sentencia -> condicion:expr  sentencia:sentencia*

public class While extends AbstractSentencia {

	public While(Expr condicion, List<Sentencia> sentencia) {
		this.condicion = condicion;
		this.sentencia = sentencia;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, sentencia);
	}

	@SuppressWarnings("unchecked")
	public While(Object condicion, Object sentencia) {
		this.condicion = (Expr) ((condicion instanceof ParserRuleContext) ? getAST(condicion) : condicion);
		this.sentencia = (List<Sentencia>) sentencia;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condicion, sentencia);
	}

	public Expr getCondicion() {
		return condicion;
	}
	public void setCondicion(Expr condicion) {
		this.condicion = condicion;
	}

	public List<Sentencia> getSentencia() {
		return sentencia;
	}
	public void setSentencia(List<Sentencia> sentencia) {
		this.sentencia = sentencia;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr condicion;
	private List<Sentencia> sentencia;

	public String toString() {
       return "{condicion:" + getCondicion() + ", sentencia:" + getSentencia() + "}";
   }
}
