package io.guill.uniovi.ds.practica_3.herramientas;

import io.guill.uniovi.ds.practica_3.figuras.Figura;

public class Select implements ComandLineTool {
	
	private Figura shapeSelected;
	
	public Select(Figura shape) {
		this.select(shape);
	}
	
	public Select() {
		this.shapeSelected = null;
	}
	
	public Figura getShapeSelected() {
		if(this.shapeSelected == null)
			throw new IllegalStateException("There's nothing selected.");
		return this.shapeSelected;
	}
	
	public void select(Figura shape) {
		this.shapeSelected = shape;
	}

}
