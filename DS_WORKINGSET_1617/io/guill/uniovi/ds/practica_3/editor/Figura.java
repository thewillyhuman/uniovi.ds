package io.guill.uniovi.ds.practica_3.editor;

public abstract class Figura {
	
	private Coordinate origin;
	
	/**
	 * Gets the origin of the shape.
	 * 
	 * @return the origin coordinate.
	 */
	public Coordinate getOrigin() {
		return this.origin;
	}
	
	/**
	 * Paints the figure from a given coordinate.
	 * 
	 * @param origin is the center of the shape
	 */
	public abstract void paint(Coordinate origin);
	
	/**
	 * Paints the figure from a given center as a decomposed coordinate.
	 * 
	 * @param x the x coordinate.
	 * @param y the y coordinate.
	 */
	public void paint(int x, int y) {
		this.paint(new Coordinate(x,y));
	}
	
	/**
	 * Decides whether a coordinate is inside a figure or not.
	 * 
	 * @param c is the coordinate to check.
	 * @return true if is inside the shape. False otherwise.
	 */
	public abstract boolean isItMe(Coordinate c);
	
	/**
	 * Decides whether a point is inside a shape or not.
	 * 
	 * @param x the x coordinate.
	 * @param y the y coordinate.
	 * @return true if is inside the shape. False otherwise. 
	 */
	public boolean isItMe(int x, int y) {
		return this.isItMe(new Coordinate(x,y));
	}

}
