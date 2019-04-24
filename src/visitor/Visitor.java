/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Programa node, Object param);
	public Object visit(DefVariable node, Object param);
	public Object visit(DefStruct node, Object param);
	public Object visit(DefFuncion node, Object param);
	public Object visit(IntType node, Object param);
	public Object visit(FloatType node, Object param);
	public Object visit(CharType node, Object param);
	public Object visit(IdentType node, Object param);
	public Object visit(ArrayType node, Object param);
	public Object visit(Campo node, Object param);
	public Object visit(Parametro node, Object param);
	public Object visit(Print node, Object param);
	public Object visit(Read node, Object param);
	public Object visit(Asignacion node, Object param);
	public Object visit(If node, Object param);
	public Object visit(While node, Object param);
	public Object visit(LlamadaFuncion node, Object param);
	public Object visit(Return node, Object param);
	public Object visit(IntConstant node, Object param);
	public Object visit(RealConstant node, Object param);
	public Object visit(CharConstant node, Object param);
	public Object visit(IdentConstant node, Object param);
	public Object visit(Cast node, Object param);
	public Object visit(ExprAritmetica node, Object param);
	public Object visit(ExprLogica node, Object param);
	public Object visit(ExprCondicion node, Object param);
	public Object visit(Not node, Object param);
	public Object visit(Array node, Object param);
	public Object visit(AccesoStruct node, Object param);
	public Object visit(LlamFuncExp node, Object param);
	public Object visit(IncrementoDecrementoExpr node, Object param);
}
