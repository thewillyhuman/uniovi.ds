package io.guill.uniovi.ds.practica_3.figuras;

import io.guill.uniovi.ds.practica_3.editor.Coordinate;

public abstract class Figura {

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
		this.paint(new Coordinate(x, y));
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
		return this.isItMe(new Coordinate(x, y));
	}

	/**
	 * Moves from the selected position to a new position.
	 * 
	 * @param oldPos the first selected position.
	 * @param newPos the second selected position.
	 */
	public void move(Coordinate oldPos, Coordinate newPos) {
		if (isItMe(oldPos)) {
			int xDis = newPos.getX() - oldPos.getX();
			int yDis = newPos.getY() - oldPos.getY();
			this.displace(xDis, yDis);
		}
	}

	/**
	 * Moves from the selected position to a new position with out using
	 * coordinate parameters.
	 * 
	 * @param oldX the old x coordinate
	 * @param oldY the old y coordinate
	 * @param newX the new x coordinate
	 * @param newY the new y coordinate
	 */
	public void move(int oldX, int oldY, int newX, int newY) {
		this.move(new Coordinate(oldX, oldY), new Coordinate(newX, newY));
	}

	/**
	 * Given that the displacement is calculated at the move method you only
	 * need to implement how the shape has to be displaced in a given direction
	 * and distance.
	 * 
	 * @param xDis the x displacement distance.
	 * @param yDis the y displacement distance.
	 */
	protected abstract void displace(int xDis, int yDis);
}
