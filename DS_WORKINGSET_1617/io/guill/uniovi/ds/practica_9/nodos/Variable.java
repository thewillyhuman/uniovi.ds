package io.guill.uniovi.ds.practica_9.nodos;

import io.guill.uniovi.ds.practica_9.contracts.Expresion;
import io.guill.uniovi.ds.practica_9.contracts.Visitor;

public class Variable implements Expresion {
	public String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
