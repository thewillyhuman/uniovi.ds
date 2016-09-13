package io.guill.uniovi.ds.practica_1.parte_2;

/**
 * Represents a rental in the system.
 * 
 * @author Guillermo Facundo Colunga.
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
		return days;
	}

	/**
	 * Gets the movie of the rental.
	 * 
	 * @return the movie of the rental.
	 */
	public Movie getMovie() {
		return movie;
	}

	/**
	 * Gets the number of points achieved with the rental.
	 * 
	 * @return the number of point given with the rental.
	 */
	public int getPoints() {
		return movie.getPoints(days);
	}

	/**
	 * Gets the total price of the rental.
	 * 
	 * @return the price of the rental.
	 */
	public double getPrice() {
		return movie.getPrice(days);
	}
}
