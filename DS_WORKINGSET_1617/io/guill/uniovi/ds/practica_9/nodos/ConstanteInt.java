package io.guill.uniovi.ds.practica_9.nodos;

import io.guill.uniovi.ds.practica_9.contracts.Expresion;
import io.guill.uniovi.ds.practica_9.contracts.Visitor;

public class ConstanteInt implements Expresion {
	public String valor;

	public ConstanteInt(String valor) {
		this.valor = valor;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
	
	public int asInteger() {
		return Integer.parseInt(valor);
	}
}
