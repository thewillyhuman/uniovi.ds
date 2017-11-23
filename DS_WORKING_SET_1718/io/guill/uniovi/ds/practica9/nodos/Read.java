package io.guill.uniovi.ds.practica9.nodos;

import io.guill.uniovi.ds.practica9.visitor.Visitor;

public class Read implements Sentencia {
	public Variable var;

	public Read(Variable var) {
		this.var = var;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		v.visitRead(this, null);
		return null;
	}
}
