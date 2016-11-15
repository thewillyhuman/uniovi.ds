package io.guill.uniovi.ds.practica_9.nodos;

import io.guill.uniovi.ds.practica_9.contracts.Expresion;
import io.guill.uniovi.ds.practica_9.contracts.Visitor;

public class Producto implements Expresion {
	public Expresion left, right;

	public Producto(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
