package io.guill.uniovi.ds.practica3.shapes;

public interface IShape {

	/**
	 * Draws the shape in the canvas.
	 */
	public void draw();

	/**
	 * Translates this point, at location (x,y), by dx along the x axis and dy
	 * along the y axis so that it now represents the point (x+dx,y+dy).
	 * 
	 * @param dx is distance to move x.
	 * @param dy is the distance to move y.
	 */
	public void move(int dx, int dy);

	/**
	 * Returns true if the shape area is in that coordinate.
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean contains(int x, int y);
	
	/**
	 * Clones the object.
	 * 
	 * @return and exact copy of the object.
	 */
	public IShape clone();

}
