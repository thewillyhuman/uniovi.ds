package io.guill.uniovi.ds.practica_3.figuras;

import io.guill.uniovi.ds.practica_3.editor.Coordinate;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Cuadrado extends Figura {
	private Coordinate origin;
	private int ancho, alto;

	@Override
	public void paint(Coordinate origin) {
		throw new NotImplementedException();
	}

	@Override
	public boolean isItMe(Coordinate c) {
		// int x,y; Coordenadas del lugar donde se ha pinchado el rat�n
		// Point esquina; int ancho, alto; Atributos del tri�ngulo

		boolean pinchado = (this.origin.getX() <= c.getX()
				&& c.getX() <= this.origin.getX() + ancho)
				&& (this.origin.getY() <= c.getY()
						&& c.getY() <= this.origin.getY() + alto);
		return pinchado;
	}

	@Override
	protected void displace(int xDis, int yDis) {
		this.origin.setCoordinate(
				new Coordinate(origin.getX() + xDis, origin.getY() + yDis));
	}
}
