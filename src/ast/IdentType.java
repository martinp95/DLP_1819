/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import org.antlr.v4.runtime.Token;

import visitor.Visitor;

//	identType:tipo -> nombre:String

public class IdentType extends AbstractTipo {

	public IdentType(String nombre) {
		this.nombre = nombre;
	}

	public IdentType(Object nombre) {
		this.nombre = (nombre instanceof Token) ? ((Token)nombre).getText() : (String) nombre;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String nombre;
	private DefStruct definicion;

	public DefStruct getDefinicion() {
		return definicion;
	}

	public String toString() {
       return "{nombre:" + getNombre() + "}";
   }

	public void setDefinicion(DefStruct defStruct) {
		this.definicion = defStruct;		
	}

	@Override
	public int getMemSize() {
		int memSize = 0;
		for(Campo campo : definicion.getCampo()) {
			memSize += campo.getTipo().getMemSize();
		}
		return memSize;
	}
}
