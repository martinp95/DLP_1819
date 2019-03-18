/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

public abstract class AbstractSentencia extends AbstractAST implements Sentencia {
	
	private DefFuncion funcion;

	public void setFuncion(DefFuncion funcion) {
		this.funcion = funcion;
	}
	
	public DefFuncion getFuncion() {
		return this.funcion;
	}

}
