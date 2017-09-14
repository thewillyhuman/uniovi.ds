package io.guill.uniovi.ds.practica1.part2;

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
