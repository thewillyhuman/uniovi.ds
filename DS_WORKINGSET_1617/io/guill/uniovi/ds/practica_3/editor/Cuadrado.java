package io.guill.uniovi.ds.practica_3.editor;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Cuadrado extends Figura {

	private int ancho, alto;

	@Override
	public void paint(Coordinate origin) {
		throw new NotImplementedException();
	}

	@Override
	public boolean isItMe(Coordinate c) {
		// int x,y; Coordenadas del lugar donde se ha pinchado el ratón
		// Point esquina; int ancho, alto; Atributos del triángulo

		boolean pinchado = (this.getOrigin().getX() <= c.getX() && c.getX() <= getOrigin()
				.getX() + ancho)
				&& (this.getOrigin().getY() <= c.getY() && c.getY() <= this
						.getOrigin().getY() + alto);
		return pinchado;
	}
}
