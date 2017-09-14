package io.guill.uniovi.ds.practica1.part2;

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
