package io.guill.uniovi.ds.practica_1.parte_2;

/**
 * Represents a new release movie.
 * 
 * @version 2.0
 * @author Guillermo Facundo Colunga
 * @repo https://github.com/ZenMaster91/uniovi.ds
 */
public class NewReleaseMovie implements MovieType {

	@Override
	public double getPrice(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
}
