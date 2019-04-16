/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	doWhile:sentencia -> sentencia:sentencia*  condicion:expr

public class DoWhile extends AbstractSentencia {

	public DoWhile(List<Sentencia> sentencia, Expr condicion) {
		this.sentencia = sentencia;
		this.condicion = condicion;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(sentencia, condicion);
	}

	@SuppressWarnings("unchecked")
	public DoWhile(Object sentencia, Object condicion) {
		this.sentencia = (List<Sentencia>) sentencia;
		this.condicion = (Expr) ((condicion instanceof ParserRuleContext) ? getAST(condicion) : condicion);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(sentencia, condicion);
	}

	public List<Sentencia> getSentencia() {
		return sentencia;
	}
	public void setSentencia(List<Sentencia> sentencia) {
		this.sentencia = sentencia;
	}

	public Expr getCondicion() {
		return condicion;
	}
	public void setCondicion(Expr condicion) {
		this.condicion = condicion;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Sentencia> sentencia;
	private Expr condicion;

	public String toString() {
       return "{sentencia:" + getSentencia() + ", condicion:" + getCondicion() + "}";
   }
}
