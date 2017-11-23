package io.guill.uniovi.ds.practica9.nodos;

import java.util.*;

import io.guill.uniovi.ds.practica9.visitor.Visitor;

public class Programa implements Nodo {
    public List<Sentencia> sentencias;
    
    public Programa(List<Sentencia>  sentencias) {
        this.sentencias = sentencias;
    }

	@Override
	public Object accept(Visitor v, Object param) {
		v.visitPrograma(this, null);
		return null;
	}
}
