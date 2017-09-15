package io.guill.uniovi.ds.practica1.part2;

/**
 * NewReleaseMovie.java
 *
 * @author willy
 * @version 201709151424
 * @since 15/09/2017
 * @formatter Oviedo Computing Community
 * @implements IMovieType
 */
public class NewReleaseMovie implements IMovieType {

	@Override
	public double getPrice(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}

}
