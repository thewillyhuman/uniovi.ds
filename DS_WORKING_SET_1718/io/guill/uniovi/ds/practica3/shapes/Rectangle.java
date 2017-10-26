package io.guill.uniovi.ds.practica3.shapes;

import java.awt.Point;

public class Rectangle implements IShape {
	
	private Point origin;
	private int width, height;
	
	/**
	 * @param first is the first point of the rectangle.
	 * @param secondn is the opposite point of the rectangle. 
	 */
	public Rectangle(Point first, Point second) {
		this(first, second.x - first.x, second.y - first.y);
	}
	
	/**
	 * @param x coordinate of the first point.
	 * @param y coordinate of the first point.
	 * @param width of the rectangle.
	 * @param height of the rectangle.
	 */
	public Rectangle(int x, int y, int width, int height) {
		this(new Point(x, y), width, height);
	}
	
	/**
	 * @param origin is the first point of the rectangle.
	 * @param width of the rectangle.
	 * @param height of the rectangle.
	 */
	public Rectangle(Point origin, int width, int height) {
		this.origin = origin;
		this.width = width;
		this.height=height;
	}

	@Override
	public void draw() {
		System.out.println("Cuadrado: x = " + origin.x + ", y = " + origin.y + ", ancho = " + width + ", alto = " + height);
	}

	@Override
	public void move(int dx, int dy) {
		origin.translate(dx, dy);
	}

	@Override
	public boolean contains(int x, int y) {
		return (origin.x <= x && x <= origin.x + width) && (origin.y <= y && y <= origin.y + height);
	}
	
	public IShape clone() {
		return new Rectangle(this.origin, this.width, this.height);
	}

}
