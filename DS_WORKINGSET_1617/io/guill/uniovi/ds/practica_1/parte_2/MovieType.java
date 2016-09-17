package io.guill.uniovi.ds.practica_1.parte_2;

/**
 * Interface for each movie category.
 * 
 * @version 2.0 
 * @author Guillermo Facundo Colunga
 * @repo https://github.com/ZenMaster91/uniovi.ds
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
