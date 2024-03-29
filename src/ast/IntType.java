/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.Visitor;

//	intType:tipo -> 

public class IntType extends AbstractTipo {

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{IntType}";
	}

	@Override
	public int getMemSize() {
		return 2;
	}

	@Override
	public char getSufijo() {
		return 'i';
	}

	@Override
	public String getNombreMAPL() {
		return "int";
	}
}
