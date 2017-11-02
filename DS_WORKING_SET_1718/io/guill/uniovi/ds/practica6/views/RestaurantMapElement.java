package io.guill.uniovi.ds.practica6.views;

import io.guill.uniovi.ds.practica6.components.Coordinates;
import io.guill.uniovi.ds.practica6.components.GPS;
import io.guill.uniovi.ds.practica6.model.Restaurant;

public class RestaurantMapElement implements MapElement {

	private Restaurant restaurant;

	public RestaurantMapElement(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String getTitle() {
		return this.restaurant.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return GPS.instance.getCoordinates(this.restaurant.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		return this.getTitle() + " " + this.restaurant.getPhone();
	}

	@Override
	public void open() {
		System.out.println("> Llamando al " + this.restaurant.getPhone());
	}
}
