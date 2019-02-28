package visitor; 
 
import java.util.List; 
 
import ast.AccesoStruct; 
import ast.Array; 
import ast.ArrayType; 
import ast.Asignacion; 
import ast.Campo; 
import ast.Cast; 
import ast.CharConstant; 
import ast.CharType; 
import ast.DefFuncion; 
import ast.DefStruct; 
import ast.DefVariable; 
import ast.Definicion; 
import ast.Expr; 
import ast.ExprAritmetica; 
import ast.ExprLogica; 
import ast.FloatType; 
import ast.IdentConstant; 
import ast.IdentType; 
import ast.If; 
import ast.IntConstant; 
import ast.IntType; 
import ast.LlamFuncExp; 
import ast.LlamadaFuncion; 
import ast.Not; 
import ast.Parametro; 
import ast.Print; 
import ast.Programa; 
import ast.Read; 
import ast.RealConstant; 
import ast.Return; 
import ast.Sentencia; 
import ast.While; 
 
public class PrintVisitor extends DefaultVisitor { 
 
//	class Programa { List<Definicion> definicion; } 
	public Object visit(Programa node, Object param) { 
 
		// super.visit(node, param); 
 
		if (node.getDefinicion() != null) 
			for (Definicion child : node.getDefinicion()) 
				child.accept(this, param); 
 
		return null; 
	} 
 
	// class DefVariable { String nombre; Tipo tipo; String ambito; } 
	public Object visit(DefVariable node, Object param) { 
 
		// super.visit(node, param); 
 
		System.out.print("var " + node.getNombre() + ":"); 
		if (node.getTipo() != null) { 
			node.getTipo().accept(this, param); 
		} 
		System.out.println(";"); 
 
		return null; 
	} 
 
	// class DefStruct { String nombre; List<Campo> campo; } 
	public Object visit(DefStruct node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print("struct " + node.getNombre() + "{\n"); 
		if (node.getCampo() != null) 
			for (Campo child : node.getCampo()) 
				child.accept(this, param); 
		System.out.println("};"); 
		return null; 
	} 
 
	// class DefFuncion { String nombre; List<Parametro> parametro; Tipo tipo; 
	// List<DefVariable> defvariable; List<Sentencia> sentencia; } 
	public Object visit(DefFuncion node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print(node.getNombre() + "("); 
		if (node.getParametro() != null) { 
			List<Parametro> params = node.getParametro(); 
			for (int i = 0; i < params.size(); i++) { 
				params.get(i).accept(this, param); 
				if (i < params.size() - 1) 
					System.out.print(", "); 
			} 
		} 
 
		System.out.print(")"); 
 
		if (node.getTipo() != null) { 
			System.out.print(": "); 
			node.getTipo().accept(this, param); 
		} 
		System.out.println("{"); 
		if (node.getDefvariable() != null) 
			for (DefVariable child : node.getDefvariable()) 
				child.accept(this, param); 
 
		if (node.getSentencia() != null) 
			for (Sentencia child : node.getSentencia()) 
				child.accept(this, param); 
		System.out.println("\n}"); 
		return null; 
	} 
 
	// class IntType { } 
	public Object visit(IntType node, Object param) { 
		System.out.print("int"); 
		return null; 
	} 
 
	// class FloatType { } 
	public Object visit(FloatType node, Object param) { 
		System.out.print("float"); 
		return null; 
	} 
 
	// class CharType { } 
	public Object visit(CharType node, Object param) { 
		System.out.print("char"); 
		return null; 
	} 
 
	// class IdentType { } 
	public Object visit(IdentType node, Object param) { 
		System.out.print(node.getNombre()); 
		return null; 
	} 
 
	// class ArrayType { String posicion; Tipo tipo; } 
	public Object visit(ArrayType node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print("[" + node.getPosicion() + "]"); 
		if (node.getTipo() != null) 
			node.getTipo().accept(this, param); 
		return null; 
	} 
 
	// class Campo { String nombre; Tipo tipo; } 
	public Object visit(Campo node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print(node.getNombre() + ":"); 
		if (node.getTipo() != null) 
			node.getTipo().accept(this, param); 
		System.out.println(";"); 
		return null; 
	} 
 
	// class Parametro { String nombre; Tipo tipo; } 
	public Object visit(Parametro node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print(node.getNombre() + ":"); 
		if (node.getTipo() != null) 
			node.getTipo().accept(this, param); 
		return null; 
	} 
 
	// class Print { Expr imprime; String tipoPrint; } 
	public Object visit(Print node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print("print" + node.getTipoPrint() +" "); 
		if (node.getImprime() != null) 
			node.getImprime().accept(this, param); 
		System.out.println(";"); 
		return null; 
	} 
 
	// class Read { Expr leer; } 
	public Object visit(Read node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print("read "); 
		if (node.getLeer() != null) 
			node.getLeer().accept(this, param); 
		System.out.println(";"); 
		return null; 
	} 
 
	// class Asignacion { Expr left; Expr right; } 
	public Object visit(Asignacion node, Object param) { 
 
		// super.visit(node, param); 
		if (node.getLeft() != null) 
			node.getLeft().accept(this, param); 
 
		System.out.print(" = "); 
 
		if (node.getRight() != null) 
			node.getRight().accept(this, param); 
 
		System.out.println(";"); 
		return null; 
	} 
 
	// class If { Expr condicion; List<Sentencia> verdadero; List<Sentencia> falso; 
	// } 
	public Object visit(If node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print("if( "); 
		if (node.getCondicion() != null) 
			node.getCondicion().accept(this, param); 
		System.out.println(" ){"); 
		if (node.getVerdadero() != null) 
			for (Sentencia child : node.getVerdadero()) 
				child.accept(this, param); 
		if (node.getFalso() != null) { 
			System.out.println("} else {"); 
			for (Sentencia child : node.getFalso()) 
				child.accept(this, param); 
		} 
		System.out.println("}"); 
		return null; 
	} 
 
	// class While { Expr condicion; List<Sentencia> sentencia; } 
	public Object visit(While node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print("while("); 
		if (node.getCondicion() != null) 
			node.getCondicion().accept(this, param); 
		System.out.println("){"); 
 
		if (node.getSentencia() != null) 
			for (Sentencia child : node.getSentencia()) 
				child.accept(this, param); 
		System.out.print("}"); 
		return null; 
	} 
 
	// class LlamadaFuncion { String nombre; List<Expr> parametrosOpt; } 
	public Object visit(LlamadaFuncion node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print(node.getNombre() + "("); 
		if (node.getParametrosOpt() != null) { 
			List<Expr> parametrosOpcionales = node.getParametrosOpt(); 
			for (int i = 0; i < parametrosOpcionales.size(); i++) { 
				parametrosOpcionales.get(i).accept(this, param); 
				if (i < parametrosOpcionales.size() - 1) 
					System.out.print(", "); 
			} 
		} 
		System.out.print(")"); 
		return null; 
	} 
 
	// class Return { Expr retorno; } 
	public Object visit(Return node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print("return "); 
		if (node.getRetorno() != null) 
			node.getRetorno().accept(this, param); 
		System.out.print(";"); 
		return null; 
	} 
 
	// class IntConstant { String valor; } 
	public Object visit(IntConstant node, Object param) { 
		System.out.print(node.getValor()); 
		return null; 
	} 
 
	// class RealConstant { String valor; } 
	public Object visit(RealConstant node, Object param) { 
		System.out.print(node.getValor()); 
		return null; 
	} 
 
	// class CharConstant { String valor; } 
	public Object visit(CharConstant node, Object param) { 
		System.out.print(node.getValor()); 
		return null; 
	} 
 
	// class IdentConstant { String valor; } 
	public Object visit(IdentConstant node, Object param) { 
		System.out.print(node.getValor()); 
		return null; 
	} 
 
	// class Cast { Tipo tipo; Expr valor; } 
	public Object visit(Cast node, Object param) { 
 
		// super.visit(node, param); 
		System.out.print("cast<"); 
		if (node.getTipo() != null) 
			node.getTipo().accept(this, param); 
		System.out.print(">"); 
		System.out.print("("); 
		if (node.getValor() != null) 
			node.getValor().accept(this, param); 
		System.out.print(")"); 
		return null; 
	} 
 
	// class ExprAritmetica { Expr left; String operador; Expr right; } 
	public Object visit(ExprAritmetica node, Object param) { 
 
		// super.visit(node, param); 
 
		if (node.getLeft() != null) 
			node.getLeft().accept(this, param); 
		 
		System.out.print(node.getOperador()); 
 
		if (node.getRight() != null) 
			node.getRight().accept(this, param); 
 
		return null; 
	} 
 
	// class ExprLogica { Expr left; String operador; Expr right; } 
	public Object visit(ExprLogica node, Object param) { 
 
		// super.visit(node, param); 
 
		if (node.getLeft() != null) 
			node.getLeft().accept(this, param); 
		 
		System.out.print(node.getOperador()); 
 
		if (node.getRight() != null) 
			node.getRight().accept(this, param); 
 
		return null; 
	} 
 
	// class Not { Expr valor; } 
	public Object visit(Not node, Object param) { 
 
		// super.visit(node, param); 
 
		if (node.getValor() != null) 
			node.getValor().accept(this, param); 
 
		return null; 
	} 
 
	// class Array { Expr nombre; Expr valor; } 
	public Object visit(Array node, Object param) { 
 
		// super.visit(node, param); 
 
		if (node.getNombre() != null) 
			node.getNombre().accept(this, param); 
		 
		System.out.print("["); 
 
		if (node.getValor() != null) 
			node.getValor().accept(this, param); 
 
		System.out.print("]"); 
		 
		return null; 
	} 
 
	// class AccesoStruct { Expr nombre; String acceso; } 
	public Object visit(AccesoStruct node, Object param) { 
 
		// super.visit(node, param); 
 
		if (node.getNombre() != null) { 
			node.getNombre().accept(this, param); 
			System.out.print("."+node.getAcceso()); 
		} 
 
		return null; 
	} 
 
	// class LlamFuncExp { String nombre; List<Expr> parametrosOpt; } 
	public Object visit(LlamFuncExp node, Object param) { 
 
		// super.visit(node, param); 
 
		System.out.print(node.getNombre() + "("); 
		if (node.getParametrosOpt() != null) { 
			List<Expr> parametrosOpcionales = node.getParametrosOpt(); 
			for (int i = 0; i < parametrosOpcionales.size(); i++) { 
				parametrosOpcionales.get(i).accept(this, param); 
				if (i < parametrosOpcionales.size() - 1) 
					System.out.print(", "); 
			} 
		} 
		System.out.print(")"); 
		return null; 
	} 
}