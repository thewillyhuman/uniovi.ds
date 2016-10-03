package io.guill.uniovi.ds.practica_3.figuras;

import io.guill.uniovi.ds.practica_3.editor.Coordinate;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Triangulo extends Figura {

	private Coordinate origin, vertex1, vertex2;

	@Override
	public void paint(Coordinate origin) {
		throw new NotImplementedException();
	}

	@Override
	public boolean isItMe(Coordinate c) {
		if (c.equals(this.origin) || c.equals(vertex1) || c.equals(vertex2))
			return true;
		return false;
	}
	
	@Override
	protected void displace(int xDis, int yDis) {
		this.origin.setCoordinate(
				new Coordinate(origin.getX() + xDis, origin.getY() + yDis));
		vertex1.setCoordinate(
				new Coordinate(vertex1.getX() + xDis, vertex1.getY() + yDis));
		vertex2.setCoordinate(
				new Coordinate(vertex2.getX() + xDis, vertex2.getY() + yDis));
	}

}
