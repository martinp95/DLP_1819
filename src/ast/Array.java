/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

//	array:expr -> nombre:expr  valor:expr

public class Array extends AbstractExpr {

	public Array(Expr nombre, Expr valor) {
		this.nombre = nombre;
		this.valor = valor;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, valor);
	}

	public Array(Object nombre, Object valor) {
		this.nombre = (Expr) ((nombre instanceof ParserRuleContext) ? getAST(nombre) : nombre);
		this.valor = (Expr) ((valor instanceof ParserRuleContext) ? getAST(valor) : valor);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(nombre, valor);
	}

	public Expr getNombre() {
		return nombre;
	}
	public void setNombre(Expr nombre) {
		this.nombre = nombre;
	}

	public Expr getValor() {
		return valor;
	}
	public void setValor(Expr valor) {
		this.valor = valor;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr nombre;
	private Expr valor;

	public String toString() {
       return "{nombre:" + getNombre() + ", valor:" + getValor() + "}";
   }
}
