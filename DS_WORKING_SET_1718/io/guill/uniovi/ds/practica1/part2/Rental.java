package io.guill.uniovi.ds.practica1.part2;

/**
 * Rental.java
 *
 * @author willy
 * @version 201709151448
 * @since 15/09/2017
 * @formatter Oviedo Computing Community
 */
public class Rental {

	private Movie movie;
	private int days;

	public Rental(Movie movie, int days) {
		this.movie = movie;
		this.days = days;
	}

	/**
	 * Gets the number of days to rent a film.
	 * 
	 * @return the number of days of the rental.
	 */
	public int getDays() {
		return this.days;
	}

	/**
	 * Gets the movie of the rental.
	 * 
	 * @return the movie of the rental.
	 */
	public Movie getMovie() {
		return this.movie;
	}

	/**
	 * Gets the number of points achieved with the rental.
	 * 
	 * @return the number of point given with the rental.
	 */
	public int getPoints() {
		return this.movie.getPoints(days);
	}

	/**
	 * Gets the total price of the rental.
	 * 
	 * @return the price of the rental.
	 */
	public double getPrice() {
		return this.movie.getPrice(days);
	}
}
