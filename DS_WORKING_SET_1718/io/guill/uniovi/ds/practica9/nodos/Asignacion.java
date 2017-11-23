package io.guill.uniovi.ds.practica9.nodos;

import io.guill.uniovi.ds.practica9.visitor.Visitor;

public class Asignacion implements Sentencia {
	public Variable variable;
	public Expresion expr;

	public Asignacion(Variable variable, Expresion expr) {
		this.variable = variable;
		this.expr = expr;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		v.visitAsignacion(this, null);
		return null;
	}

}
