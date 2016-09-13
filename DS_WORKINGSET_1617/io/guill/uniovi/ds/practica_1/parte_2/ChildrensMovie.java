package io.guill.uniovi.ds.practica_1.parte_2;

/**
 * Represents a children movie type.
 * 
 * @author Guillermo Facundo Colunga.
 */
public class ChildrensMovie implements Category {

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
