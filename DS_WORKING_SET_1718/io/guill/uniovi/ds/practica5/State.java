package io.guill.uniovi.ds.practica5;

import java.util.List;

import io.guill.uniovi.ds.practica3.editor.Draw;
import io.guill.uniovi.ds.practica3.shapes.IShape;

public class State {

	private List<IShape> snapshot;
	
	public State(Draw current) {
		this.snapshot = current.clone();
	}
	
	public List<IShape> state() { return this.snapshot; }
}
