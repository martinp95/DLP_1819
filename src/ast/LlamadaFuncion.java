/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	llamadaFuncion:sentencia -> nombre:String  parametrosOpt:expr*

public class LlamadaFuncion extends AbstractSentencia {

	public LlamadaFuncion(String nombre, List<Expr> parametrosOpt) {
		this.nombre = nombre;
		this.parametrosOpt = parametrosOpt;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametrosOpt);
	}

	@SuppressWarnings("unchecked")
	public LlamadaFuncion(Object nombre, Object parametrosOpt) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;
		this.parametrosOpt = (List<Expr>) parametrosOpt;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, parametrosOpt);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Expr> getParametrosOpt() {
		return parametrosOpt;
	}
	public void setParametrosOpt(List<Expr> parametrosOpt) {
		this.parametrosOpt = parametrosOpt;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	private List<Expr> parametrosOpt;

	public String toString() {
       return "{nombre:" + getNombre() + ", parametrosOpt:" + getParametrosOpt() + "}";
   }
}
