package io.guill.uniovi.ds.practica_6.components;

import io.guill.uniovi.ds.practica_6.model.Restaurant;
import io.guill.uniovi.ds.practica_6.views.MapElement;

public class RestaurantMapElement implements MapElement {
	
	private Restaurant restaurant;
	
	public RestaurantMapElement(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String getName() {
		return this.restaurant.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return new GPS().getCoordinates(this.restaurant.getAddress());
	}

	@Override
	public String getTooltipInfo() {
		return this.getName() + " " + this.restaurant.getPhone();
	}

	@Override
	public void open() {
		System.out.println("> Llamando al " + this.restaurant.getPhone());
	}
}
