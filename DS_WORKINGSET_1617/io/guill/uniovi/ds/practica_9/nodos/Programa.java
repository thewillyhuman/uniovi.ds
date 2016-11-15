package io.guill.uniovi.ds.practica_9.nodos;

import io.guill.uniovi.ds.practica_9.contracts.Nodo;
import io.guill.uniovi.ds.practica_9.contracts.Sentencia;
import io.guill.uniovi.ds.practica_9.contracts.Visitor;

import java.util.*;

public class Programa implements Nodo {
    public List<Sentencia> sentencias;
    
    public Programa(List<Sentencia>  sentencias) {
        this.sentencias = sentencias;
    }

    @Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}
}
