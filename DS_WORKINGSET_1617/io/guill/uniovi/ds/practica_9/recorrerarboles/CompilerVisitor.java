package io.guill.uniovi.ds.practica_9.recorrerarboles;

import io.guill.uniovi.ds.practica_9.contracts.Sentencia;
import io.guill.uniovi.ds.practica_9.contracts.Visitor;
import io.guill.uniovi.ds.practica_9.nodos.Asignacion;
import io.guill.uniovi.ds.practica_9.nodos.ConstanteInt;
import io.guill.uniovi.ds.practica_9.nodos.Division;
import io.guill.uniovi.ds.practica_9.nodos.Print;
import io.guill.uniovi.ds.practica_9.nodos.Producto;
import io.guill.uniovi.ds.practica_9.nodos.Programa;
import io.guill.uniovi.ds.practica_9.nodos.Read;
import io.guill.uniovi.ds.practica_9.nodos.Suma;
import io.guill.uniovi.ds.practica_9.nodos.Variable;

public class CompilerVisitor implements Visitor {
	
	@Override
	public Object visit(Programa p, Object param) {
		for(Sentencia s : p.sentencias) {
			s.accept(this, null);
		} return null;
	}

	@Override
	public Object visit(Print print, Object param) {
		System.out.print("print ");
		print.expr.accept(this, null);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Asignacion asigna, Object param) {
		asigna.expr.accept(this, null);
		System.out.print(" = ");
		asigna.expr.accept(this, null);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {
		System.out.print("read ");
		read.var.accept(this, null);
		System.out.println(";");
		return null;
	}

	@Override
	public Object visit(Suma suma, Object param) {
		suma.left.accept(this, null);
		System.out.print(" + ");
		suma.right.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Division div, Object param) {
		div.left.accept(this, null);
		System.out.print(" / ");
		div.right.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Producto prod, Object param) {
		prod.left.accept(this, null);
		System.out.print(" * ");
		prod.right.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Variable var, Object param) {
		System.out.print(var.name);
		return null;
	}

	@Override
	public Object visit(ConstanteInt cte, Object param) {
		System.out.print(cte.valor);
		return null;
	}
}
