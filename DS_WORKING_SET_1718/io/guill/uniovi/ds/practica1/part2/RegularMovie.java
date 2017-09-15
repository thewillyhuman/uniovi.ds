package io.guill.uniovi.ds.practica1.part2;

/**
 * RegularMovie.java
 *
 * @author willy
 * @version 201709151412
 * @since 15/09/2017
 * @formatter Oviedo Computing Community
 * @implements IMovieType
 */
public class RegularMovie implements IMovieType {

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
