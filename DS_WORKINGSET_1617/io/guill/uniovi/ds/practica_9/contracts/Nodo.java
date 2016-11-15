package io.guill.uniovi.ds.practica_9.contracts;


public interface Nodo {
	Object accept(Visitor v, Object param);

}
