package io.guill.uniovi.ds.practica_9.nodos;

import io.guill.uniovi.ds.practica_9.contracts.Expresion;
import io.guill.uniovi.ds.practica_9.contracts.Sentencia;
import io.guill.uniovi.ds.practica_9.contracts.Visitor;

public class Print implements Sentencia {
	public Expresion expr;

	public Print(Expresion expr) {
		this.expr = expr;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

}
