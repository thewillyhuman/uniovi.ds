package io.guill.uniovi.ds.practica1.part2;

/**
 * ChildrenMovie.java
 *
 * @author willy
 * @version 201709151411
 * @since 15/09/2017
 * @formatter Oviedo Computing Community
 * @implements IMovieType
 */
public class ChildrenMovie implements IMovieType {
	
	@Override
	public double getPrice(int days) {
		double price = 1.5;
		if (days > 3)
			price += (days - 3) * 1.5;
		return price;
	}

	@Override
	public int getPoints(int days) {
		return 1;
	}

}
