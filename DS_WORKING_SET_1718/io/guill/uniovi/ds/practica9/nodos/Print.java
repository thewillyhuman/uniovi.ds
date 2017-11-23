package io.guill.uniovi.ds.practica9.nodos;

import io.guill.uniovi.ds.practica9.visitor.Visitor;

public class Print implements Sentencia {
	public Expresion expr;

	public Print(Expresion expr) {
		this.expr = expr;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		v.visitPrint(this, null);
		return null;
	}

}
