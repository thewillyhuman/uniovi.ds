package io.guill.uniovi.ds.practica9.nodos;

import io.guill.uniovi.ds.practica9.visitor.Visitor;

public interface Nodo {
	
	Object accept(Visitor v, Object param);

}
