package io.guill.uniovi.ds.practica_3.herramientas;

import io.guill.uniovi.ds.practica_3.editor.Coordinate;

public class Pinchar implements MouseTool {

	private Coordinate pinchado;
	
	public Pinchar(int x, int y) {
		this.pinchado = new Coordinate(x, y);
	}
	
	public Coordinate getCoordinate() {
		return this.pinchado;
	}
}
