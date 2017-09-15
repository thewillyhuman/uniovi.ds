package io.guill.uniovi.ds.practica1.part2;

/**
 * IMovieType.java
 *
 * @author willy
 * @version 201709151808
 * @since 15/09/2017
 * @formatter Oviedo Computing Community
 */
public interface IMovieType {

	/**
	 * Gets the price for a given days
	 * 
	 * @param days are the rented days.
	 * @return the total price for the days selected.
	 */
	public double getPrice(int days);

	/**
	 * Gets the number of points for a given days.
	 * 
	 * @param days to be rented.
	 * @return the total number of points achieved.
	 */
	public int getPoints(int days);
}
