package codegeneration;

import ast.*;
import visitor.*;

/**
 * Clase encargada de asignar direcciones a las variables.
 */
public class MemoryAllocation extends DefaultVisitor {

	// class Programa { List<Definicion> definicion; }
	public Object visit(Programa node, Object param) {
		int direccion = 0;
		if (node.getDefinicion() != null)
			for (Definicion child : node.getDefinicion()) {
				if (child instanceof DefVariable) {
					((DefVariable) child).setDireccion(direccion);
					direccion += ((DefVariable) child).getTipo().getMemSize();
				}
				child.accept(this, param);
			}
		return null;
	}

	// class DefStruct { String nombre; List<Campo> campo; }
	public Object visit(DefStruct node, Object param) {
		int direccion = 0;
		if (node.getCampo() != null)
			for (Campo child : node.getCampo()) {
				child.setDireccion(direccion);
				direccion += child.getTipo().getMemSize();
				child.accept(this, param);
			}
		return null;
	}

	// class DefFuncion { String nombre; List<Parametro> parametro; Tipo tipo;
	// List<DefVariable> defvariable; List<Sentencia> sentencia; }
	public Object visit(DefFuncion node, Object param) {
		if (node.getParametro() != null) {
			int direccion = 4;
			for (int i = (node.getParametro().size() - 1); i >= 0; i--) {
				node.getParametro().get(i).setDireccion(direccion);
				direccion += node.getParametro().get(i).getTipo().getMemSize();
				node.getParametro().get(i).accept(this, param);
			}
		}
		if (node.getTipo() != null)
			node.getTipo().accept(this, param);

		if (node.getDefvariable() != null) {
			int direccion = 0;
			for (DefVariable child : node.getDefvariable()) {
				direccion -= child.getTipo().getMemSize();
				child.setDireccion(direccion);
				child.accept(this, param);
			}
		}
		if (node.getSentencia() != null)
			for (Sentencia child : node.getSentencia())
				child.accept(this, param);
		return null;
	}
}
