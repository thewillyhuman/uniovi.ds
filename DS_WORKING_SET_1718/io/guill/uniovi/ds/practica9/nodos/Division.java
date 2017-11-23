package io.guill.uniovi.ds.practica9.nodos;

import io.guill.uniovi.ds.practica9.visitor.Visitor;

public class Division implements Expresion {
	public Expresion left, right;

	public Division(Expresion left, Expresion right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		v.visitDivision(this, null);
		return null;
	}

}
