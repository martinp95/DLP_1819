/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

import visitor.*;

import org.antlr.v4.runtime.*;

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
		// TODO Auto-generated method stub
		return 'i';
	}
}
