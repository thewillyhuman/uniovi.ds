package io.guill.uniovi.ds.practica1.part2;

import java.util.List;
import java.util.ArrayList;

/**
 * Customer.java
 *
 * @author willy
 * @version 201709151406
 * @since 15/09/2017
 * @formatter Oviedo Computing Community
 */
public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	/**
	 * Main constructor to create a customer.
	 * 
	 * @param name of the customer.
	 */
	public Customer(String name) {
		this.name = name;
	}

	/**
	 * Adds a rental to the list of rentals.
	 * 
	 * @param rental to be added to the customer.
	 */
	public void addRental(Rental rental) {
		this.rentals.add(rental);
	}

	/**
	 * Gets the name of the customer.
	 * 
	 * @return the name of the customer.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Gets as a string the current status of the customer.
	 * 
	 * @return a string the current status of the customer.
	 */
	public String status() {
		double totalPrice = 0;
		int totalPoints = 0;
		String result = "Rental Record for " + this.getName() + "\n";

		for (Rental rental : rentals) {
			totalPrice += rental.getPrice();
			totalPoints += rental.getPoints();

			result += "\t" + rental.getMovie().getTitle() + "\t"
					+ rental.getPrice() + "\n";
		}

		result += "Amount owed is " + totalPrice + "\n";
		result += "You earned " + totalPoints + " frequent renter points";

		return result;
	}
}
