package io.guill.uniovi.ds.practica_9.recorrerarboles;

import java.io.IOException;

import com.sun.javafx.binding.IntegerConstant;

import io.guill.uniovi.ds.practica_9.contracts.Expresion;
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
		print.expr.accept(this, null);
		return null;
	}

	@Override
	public Object visit(Asignacion asigna, Object param) {
		asigna.expr = (Expresion) param;
		return asigna;
	}

	@Override
	public Object visit(Read read, Object param) {
		System.out.print("Enter a value for " + read.var.name + " : ");
		return null;
	}

	@Override
	public Object visit(Suma suma, Object param) {
		return ((ConstanteInt) suma.left.accept(this, null)).asInteger() + ((ConstanteInt) suma.right.accept(this, null)).asInteger();
	}

	@Override
	public Object visit(Division div, Object param) {
		return ((ConstanteInt) div.left.accept(this, null)).asInteger() / ((ConstanteInt) div.right.accept(this, null)).asInteger();
	}

	@Override
	public Object visit(Producto prod, Object param) {
		return ((ConstanteInt) prod.left.accept(this, null)).asInteger() * ((ConstanteInt) prod.right.accept(this, null)).asInteger();
	}

	@Override
	public Object visit(Variable var, Object param) {
		System.out.println(var.name);
		return var;
	}

	@Override
	public Object visit(ConstanteInt cte, Object param) {
		System.out.println(cte);
		return cte;
	}

}
