package io.guill.uniovi.ds.practica3.editor;

import java.util.*;

import io.guill.uniovi.ds.practica3.shapes.IShape;

public class Draw {
	
	private List<IShape> shapes = new ArrayList<IShape>();

	public void addShape(IShape figura) {
		shapes.add(figura);
	}
	
	public void draw() {
		for (IShape figura : shapes)
			figura.draw();
	}

	public IShape shapeAt(int x, int y) {
		for (IShape figura : shapes)
			if (figura.contains(x, y))
				return figura;
		return null;
	}
	
	public List<IShape> shapes() {
		return this.shapes;
	}

}
