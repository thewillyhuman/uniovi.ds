package io.guill.uniovi.ds.practica_3.figuras;

import io.guill.uniovi.ds.practica_3.editor.Coordinate;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Circulo extends Figura {

	private Coordinate origin;
	private int radius;

	@Override
	public void paint(Coordinate origin) {
		throw new NotImplementedException();
	}

	@Override
	public boolean isItMe(Coordinate c) {
		double distancia = Math.sqrt(Math.pow(c.getX() - this.origin.getX(), 2)
				+ Math.pow(c.getY() - this.origin.getY(), 2));
		boolean pinchado = distancia < this.radius;
		return pinchado;
	}

	@Override
	protected void displace(int xDis, int yDis) {
		this.origin.setCoordinate(
				new Coordinate(origin.getX() + xDis, origin.getY() + yDis));
	}
}
