package io.guill.uniovi.ds.practica_3.editor;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Circulo extends Figura {
	
	private int radius;

	@Override
	public void paint(Coordinate origin) {
		throw new NotImplementedException();
	}

	@Override
	public boolean isItMe(Coordinate c) {
		//int x,y;	Coordenadas del lugar donde se ha pinchado el ratón
		// Point centro; int radio;	Atributos del círculo
		double distancia = Math.sqrt(Math.pow(c.getX() - this.getOrigin().getX(), 2) + Math.pow(c.getY() - this.getOrigin().getY(), 2));
		boolean pinchado = distancia < this.radius;
		return pinchado;
	}
}
