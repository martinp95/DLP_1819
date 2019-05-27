/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	defVariable:definicion -> nombre:String  tipo:tipo  ambito:String

public class DefVariable extends AbstractDefinicion {

	public DefVariable(String nombre, Tipo tipo, String ambito) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.ambito = ambito;

		// Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
		// Obtiene la linea/columna a partir de las de los hijos.
		setPositions(tipo);
	}

	public DefVariable(Object nombre, Object tipo, Object ambito) {
		this.nombre = (nombre instanceof Token) ? ((Token) nombre).getText() : (String) nombre;
		this.tipo = (Tipo) ((tipo instanceof ParserRuleContext) ? getAST(tipo) : tipo);
		this.ambito = (ambito instanceof Token) ? ((Token) ambito).getText() : (String) ambito;

		// Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
		// Obtiene la linea/columna a partir de las de los hijos.
		setPositions(nombre, tipo, ambito);
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

	public String getAmbito() {
		return ambito;
	}

	public void setAmbito(String ambito) {
		this.ambito = ambito;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	private String nombre;
	private Tipo tipo;
	private String ambito;
	private Parametro parametro;
	private int direccion;
	private boolean referencia;

	public boolean isReferencia() {
		return referencia;
	}

	public int getDireccion() {
		return direccion;
	}

	public Parametro getParametro() {
		return parametro;
	}

	public String toString() {
		return "{nombre:" + getNombre() + ", tipo:" + getTipo() + ", ambito:" + getAmbito() + "}";
	}

	public void setParametro(Parametro node) {
		this.parametro = node;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public void setReferencia(boolean referencia) {
		this.referencia = referencia;
	}
}
