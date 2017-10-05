package io.guill.uniovi.ds.practica3.tools;

public interface ITool {

	/**
	 * Simulates a click of the mouse.
	 * 
	 * @param x coordinate where click was.
	 * @param y coordinate where click was.
	 */
	public void click(int x, int y);

	/**
	 * Simulates a move of the mouse to those coordinates.
	 * 
	 * @param x coordinate to move to.
	 * @param y coordinate to move to.
	 */
	public void move(int x, int y);

	/**
	 * Simulates a release of the mouse at that position.
	 * 
	 * @param x coordinate where release was.
	 * @param y coordinate where release was.
	 */
	public void release(int x, int y);

}
