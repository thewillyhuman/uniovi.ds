package io.guill.uniovi.ds.practica6.MapKit;

import io.guill.uniovi.ds.practica6.components.Coordinates;
import io.guill.uniovi.ds.practica6.model.Restaurant;

public class MKRestaurantItem implements MKMapItem {

	private Restaurant restaurant;

	public MKRestaurantItem(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String placemark() {
		return this.restaurant.getName();
	}

	@Override
	public Coordinates coordinates() {
		return new MKDirectionsRequest().getCoordinates(this.restaurant.getAddress());
	}

	@Override
	public String annotations() {
		return this.placemark() + " " + this.restaurant.getPhone();
	}

	@Override
	public void open() {
		System.out.println("> Llamando al " + this.restaurant.getPhone());
	}
}
