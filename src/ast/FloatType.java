/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.Visitor;

//	floatType:tipo -> 

public class FloatType extends AbstractTipo {

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{FloatType}";
	}

	@Override
	public int getMemSize() {
		return 4;
	}

	@Override
	public char getSufijo() {
		return 'f';
	}

	@Override
	public String getNombreMAPL() {
		return "float";
	}
}
