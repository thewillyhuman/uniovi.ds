package io.guill.uniovi.ds.practica9.nodos;

import io.guill.uniovi.ds.practica9.visitor.Visitor;

public class Variable implements Expresion {
	public String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		v.visitVariable(this, null);
		return null;
	}
}
