package io.guill.uniovi.ds.practica_1.parte_2;

/**
 * Represents a new release movie.
 * 
 * @author Guillermo Facundo Colunga.
 */
public class NewReleaseMovie implements Category {

	@Override
	public double getPrice(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
}
