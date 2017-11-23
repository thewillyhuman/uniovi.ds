package io.guill.uniovi.ds.practica9.nodos;

import io.guill.uniovi.ds.practica9.visitor.Visitor;

public class ConstanteInt implements Expresion {
	public String valor;

	public ConstanteInt(String valor) {
		this.valor = valor;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		v.visitConstanteInt(this, null);
		return null;
	}
}
