package io.guill.uniovi.ds.practica_1.parte_2;

import java.util.*;

/**
 * Represents a customer inside the system.
 * 
 * @version 2.0
 * @author Guillermo Facundo Colunga
 * @repo https://github.com/ZenMaster91/uniovi.ds
 */
public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	/**
	 * Main constructor to create a customer.
	 * 
	 * @param name
	 *            of the customer.
	 */
	public Customer(String name) {
		this.name = name;
	}

	/**
	 * Adds a rental to the list of rentals.
	 * 
	 * @param rental
	 *            to be added to the customer.
	 */
	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	/**
	 * Gets the name of the customer.
	 * 
	 * @return the name of the customer.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets as a string the current status of the customer.
	 * 
	 * @return a string the current status of the customer.
	 */
	public String status() {
		double totalPrice = 0;
		int totalPoints = 0;
		String result = "Alquileres de: " + getName() + "\n";

		for (Rental rental : rentals) {
			totalPrice += rental.getPrice();
			totalPoints += rental.getPoints();

			result += "\t" + rental.getMovie().getTitle() + "\t" + rental.getPrice() + " E\n";
		}

		result += "La deuda es de " + totalPrice + " E\n";
		result += "Has obtenido " + totalPoints + " puntos en tu tarjeta";

		return result;
	}
}
