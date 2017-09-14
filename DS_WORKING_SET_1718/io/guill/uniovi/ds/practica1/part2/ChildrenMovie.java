package io.guill.uniovi.ds.practica1.part2;

public class ChildrenMovie implements MovieType {
	
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
