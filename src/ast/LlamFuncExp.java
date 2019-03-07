/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	llamFuncExp:expr -> nombre:String  parametrosOpt:expr*

public class LlamFuncExp extends AbstractExpr {

	public LlamFuncExp(String nombre, List<Expr> parametrosOpt) {
		this.nombre = nombre;
		this.parametrosOpt = parametrosOpt;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parametrosOpt);
	}

	@SuppressWarnings("unchecked")
	public LlamFuncExp(Object nombre, Object parametrosOpt) {
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

	public DefFuncion getDefinicion() {
		return definicion;
	}

	public void setDefinicion(DefFuncion definicion) {
		this.definicion = definicion;
	}

	private String nombre;
	private List<Expr> parametrosOpt;
	private DefFuncion definicion;

	public String toString() {
       return "{nombre:" + getNombre() + ", parametrosOpt:" + getParametrosOpt() + "}";
   }
}
