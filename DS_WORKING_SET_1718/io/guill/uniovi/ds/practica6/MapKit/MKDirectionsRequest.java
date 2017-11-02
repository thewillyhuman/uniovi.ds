package io.guill.uniovi.ds.practica6.MapKit;

import io.guill.uniovi.ds.practica6.components.Coordinates;
import io.guill.uniovi.ds.practica6.components.GPS;

public class MKDirectionsRequest {
	
	private static GPS GPS = new GPS();

	public MKDirectionsRequest() { }
	
	public void navigate(String address) {
		GPS.navigate(address);
	}
	
	public Coordinates getCoordinates(String address) {
		return GPS.getCoordinates(address);
	}

	public String getAddress(Coordinates coordinates) {
		return GPS.getAddress(coordinates);
	}

}
