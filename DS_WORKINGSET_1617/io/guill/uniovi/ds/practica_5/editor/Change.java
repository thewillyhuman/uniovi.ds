package io.guill.uniovi.ds.practica_5.editor;

import io.guill.uniovi.ds.practica_3.editor.Dibujo;
import io.guill.uniovi.ds.practica_3.editor.Figura;

public class Change {

	private Dibujo undoo;
	private Dibujo redoo;
	
	public Change(Dibujo newStatus) {
		setNewStatus(newStatus);
	}
	
	public Change(Dibujo newStatus, Dibujo oldStatus) {
		setNewStatus(newStatus);
		setPrevStatus(oldStatus);
	}
	
	public Dibujo getUndoo() {
		Dibujo aux = new Dibujo();
		for(Figura f : undoo.getFiguras())
			aux.AddFigura(f);
		return aux;
	}
	
	public Dibujo getRedoo() {
		Dibujo aux = new Dibujo();
		for(Figura f : redoo.getFiguras())
			aux.AddFigura(f);
		return aux;
	}
	
	public void setNewStatus(Dibujo newStatus) {
		undoo = newStatus;
	}
	
	public void setPrevStatus(Dibujo oldStatus) {
		redoo = oldStatus;
	}
}
