package io.guill.uniovi.ds.practica3.shapes;

import java.awt.Point;

public class Circle implements IShape {
	
	private Point center;
	private int radious;
	
	public Circle (int x, int y, int radious) {
		this(new Point(x,y), radious);
	}
	
	public Circle(Point center, int radious) {
		this.center = center;
		this.radious = radious;
	}

	@Override
	public void draw() {
		System.out.println("Circle: center = " + center + ", radious = " + radious);
	}

	@Override
	public void move(int dx, int dy) {
		center.translate(dx, dy);
	}

	@Override
	public boolean contains(int x, int y) {
		double distancia = Math.sqrt(Math.pow(x - center.x, 2) + Math.pow(y - center.y, 2));
		return distancia < radious;
	}

}
