package io.guill.uniovi.ds.practica_1.parte_2;

/**
 * Represents a regular movie.
 * 
 * @version 2.0
 * @author Guillermo Facundo Colunga
 * @repo https://github.com/ZenMaster91/uniovi.ds
 */
public class RegularMovie implements MovieType {

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
