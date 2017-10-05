package io.guill.uniovi.ds.practica3.shapes;

import java.awt.Point;

public class Triangle implements IShape {
	
	private Point v1, v2, v3;
	
	/**
	 * @param v1 is the first corner of the triangle.
	 * @param v2 is the second corner of the triangle.
	 * @param v3 is the third corner of the triangle.
	 */
	public Triangle(Point v1, Point v2, Point v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	@Override
	public void draw() {
		System.out.println("Triangle: v1 = " + v1 + ", v2 = " + v2 + ", v3 = " + v3);
	}

	@Override
	public void move(int dx, int dy) {
		v1.translate(dx, dy);
		v2.translate(dx, dy);
		v3.translate(dx, dy);
	}

	@Override
	public boolean contains(int x, int y) {
		Point posicion = new Point(x,y);
		return posicion.equals(v1) || posicion.equals(v2) || posicion.equals(v3);
	}

}
