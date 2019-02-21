/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	accesoStruct:expr -> nombre:expr  acceso:String

public class AccesoStruct extends AbstractExpr {

	public AccesoStruct(Expr nombre, String acceso) {
		this.nombre = nombre;
		this.acceso = acceso;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre);
	}

	public AccesoStruct(Object nombre, Object acceso) {
		this.nombre = (Expr) ((nombre instanceof ParserRuleContext) ? getAST(nombre) : nombre);
		this.acceso = (acceso instanceof Token) ? ((Token)acceso).getText() : (String) acceso;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, acceso);
	}

	public Expr getNombre() {
		return nombre;
	}
	public void setNombre(Expr nombre) {
		this.nombre = nombre;
	}

	public String getAcceso() {
		return acceso;
	}
	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr nombre;
	private String acceso;

	public String toString() {
       return "{nombre:" + getNombre() + ", acceso:" + getAcceso() + "}";
   }
}
