package io.guill.uniovi.ds.practica_11.adapter.api;

import java.awt.Point;

import io.guill.uniovi.ds.practica_11.adapter.platform.Image2D;

public interface PlatformAPI {

	/**
	 * Loads the image in the system memory.
	 * 
	 * @param file image name to load.
  	 * @return the image file as a 2D image.
	 */
	public Image2D loadImage(String file);
	
	/**
	 * Gets the position.
	 * 
	 * @return the position.
	 */
	public Point getPosition();
	
	/**
	 * Displays the ball.
	 * 
	 * @param image image to display.
	 * @param point point where the image will be displayed.
	 */
	public void drawBall(Image2D image, Point point);
}
