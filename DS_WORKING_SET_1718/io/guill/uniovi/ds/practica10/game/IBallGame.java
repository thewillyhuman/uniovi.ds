package io.guill.uniovi.ds.practica10.game;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.platform.Image2D;

public interface IBallGame {

	/**
	 * Loads a given image in the platform. Will return the image as a Image2D
	 * type.
	 * 
	 * @param file to be loaded as an image.
	 * @return an Image2D type that is the result of loading the file in the
	 *         corresponding platform.
	 */
	public Image2D loadImage( String file );

	/**
	 * Draws the image in the corresponding coordinate.
	 * 
	 * @param x component of the coordinate to start drawing the image.
	 * @param y component of the coordinate to start drawing the image.
	 * @param image to be drawn.
	 */
	public void draw( int x, int y, Image2D image );

	/**
	 * Represents an interaction of the user. Will return the point of the
	 * screen which the user had interact with.
	 * 
	 * @return the point where the interaction has take place.
	 */
	public Point getInteraction();

}
