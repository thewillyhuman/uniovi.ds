package io.guill.uniovi.ds.practica_1.parte_2;

/**
 * Interface for each movie category.
 * 
 * @author Guillermo Facundo Colunga.
 */
public interface MovieType {

	/**
	 * Gets the price for a given days
	 * 
	 * @param days
	 *            are the rented days.
	 * @return the total price for the days selected.
	 */
	public double getPrice(int days);

	/**
	 * Gets the number of points for a given days.
	 * 
	 * @param days
	 *            to be rented.
	 * @return the total number of points achieved.
	 */
	public int getPoints(int days);
}
