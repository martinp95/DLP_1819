/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	parametro -> nombre:String  tipo:tipo  referencia:boolean

public class Parametro extends AbstractAST  {

	public Parametro(String nombre, Tipo tipo, boolean referencia) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.referencia = referencia;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(tipo);
	}

	public Parametro(Object nombre, Object tipo, Object referencia) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;
		this.tipo = (Tipo) ((tipo instanceof ParserRuleContext) ? getAST(tipo) : tipo);
		this.referencia = (referencia instanceof Token) ? Boolean.valueOf(((Token)referencia).getText()) : (Boolean) referencia;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, tipo, referencia);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public boolean getReferencia() {
		return referencia;
	}
	public void setReferencia(boolean referencia) {
		this.referencia = referencia;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	public int getDireccion() {
		return direccion;
	}

	private Tipo tipo;
	private boolean referencia;
	private int direccion;

	public String toString() {
       return "{nombre:" + getNombre() + ", tipo:" + getTipo() + ", referencia:" + getReferencia() + "}";
   }

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}
}
