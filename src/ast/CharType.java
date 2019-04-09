/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.Visitor;

//	charType:tipo -> 

public class CharType extends AbstractTipo {

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

	public String toString() {
		return "{CharType}";
	}

	@Override
	public int getMemSize() {
		return 1;
	}

	@Override
	public char getSufijo() {
		return 'b';
	}

	@Override
	public String getNombreMAPL() {
		return "byte";
	}
}
