package io.guill.uniovi.ds.practica_3.editor;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Triangulo extends Figura {
	
	private Coordinate vertex1, vertex2;

	@Override
	public void paint(Coordinate origin) {
		throw new NotImplementedException();
	}

	@Override
	public boolean isItMe(Coordinate c) {
		if(c.equals(this.getOrigin()) || c.equals(vertex1) || c.equals(vertex2))
			return true;
		return false;
	}
}
