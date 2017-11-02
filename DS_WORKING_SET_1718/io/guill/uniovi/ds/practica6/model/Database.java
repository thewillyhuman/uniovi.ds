package io.guill.uniovi.ds.practica6.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.guill.uniovi.ds.practica6.components.Coordinates;

public final class Database {
	
	public static final Database instance = new Database();
	
	private List<Monument> monuments;
	private List<Photo> photos;
	private List<Restaurant> restaurants;
	
	private Database() {
		monuments = new ArrayList<Monument>();
		monuments.add(new Monument("Coliseo", "Vespasiano", "Avenida del Coliseo 1. Roma"));
		
		photos = new ArrayList<Photo>();
		photos.add(new Photo("El Coliseo de noche", "Raúl", new Coordinates(20, 20)));
		
		restaurants = new ArrayList<Restaurant>();
		restaurants.add(new Restaurant("El Gladiador", "Calle del Triunfo 2. Roma", "555 123 456"));
	}
	
	public Collection<Monument> monuments() {
		return this.monuments;
	}
	
	public Collection<Photo> photos() {
		return this.photos;
	}
	
	public Collection<Restaurant> restaurants() {
		return this.restaurants;
	}

}
