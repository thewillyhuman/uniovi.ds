package io.guill.uniovi.ds.practica9.visitor;

import io.guill.uniovi.ds.practica9.nodos.Asignacion;
import io.guill.uniovi.ds.practica9.nodos.ConstanteInt;
import io.guill.uniovi.ds.practica9.nodos.Division;
import io.guill.uniovi.ds.practica9.nodos.Print;
import io.guill.uniovi.ds.practica9.nodos.Producto;
import io.guill.uniovi.ds.practica9.nodos.Programa;
import io.guill.uniovi.ds.practica9.nodos.Read;
import io.guill.uniovi.ds.practica9.nodos.Sentencia;
import io.guill.uniovi.ds.practica9.nodos.Suma;
import io.guill.uniovi.ds.practica9.nodos.Variable;

public class PrintVisitor implements Visitor {

	@Override
	public Object visitAsignacion(Asignacion a, Object o) {
		a.variable.accept(this, null);
		System.out.print(" = ");
		a.expr.accept(this, null);
		return null;
	}

	@Override
	public Object visitConstanteInt(ConstanteInt ci, Object o) {
		System.out.print(ci.valor);
		return null;
	}

	@Override
	public Object visitDivision(Division d, Object o) {
		d.left.accept(this, null);
		System.out.print(" / ");
		d.right.accept(this, null);
		return null;
	}

	@Override
	public Object visitPrint(Print p, Object o) {
		System.out.print("print ");
		p.expr.accept(this, null);
		return null;
	}

	@Override
	public Object visitProducto(Producto p, Object o) {
		p.left.accept(this, null);
		System.out.print(" * ");
		p.right.accept(this, null);
		return null;
	}

	@Override
	public Object visitPrograma(Programa p, Object o) {
		for(Sentencia s : p.sentencias) {
			s.accept(this, null);
			System.out.println(";");
		}
		return null;
	}

	@Override
	public Object visitRead(Read e, Object o) {
		System.out.print("read ");
		e.var.accept(this, null);
		return null;
	}

	@Override
	public Object visitSuma(Suma s, Object o) {
		s.left.accept(this, null);
		System.out.print(" + ");
		s.right.accept(this, null);
		return null;
	}

	@Override
	public Object visitVariable(Variable v, Object o) {
		System.out.print(v.name);
		return null;
	}
}
