package io.guill.uniovi.ds.practica_1.parte_2;

/**
 * Represents a regular movie.
 * 
 * @author Guillermo Facundo Colunga.
 */
public class RegularMovie implements Category {

	@Override
	public double getPrice(int daysRented) {
		double result = 2;
		if (daysRented > 2)
			result += (daysRented - 2) * 1.5;
		return result;
	}

	@Override
	public int getPoints(int daysRented) {
		return 1;
	}

}
