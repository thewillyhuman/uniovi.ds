package io.guill.uniovi.ds.practica6.MapKit;

import io.guill.uniovi.ds.practica6.components.Coordinates;
import io.guill.uniovi.ds.practica6.components.GPS;

public class MKDirectionsRequest {
	
	private final static GPS _gps = new GPS();

	public MKDirectionsRequest() { }
	
	/**
	 * Navigates to the given address.
	 * 
	 * @param address to navigate to.
	 */
	public void navigate(String address) {
		_gps.navigate(address);
	}
	
	/**
	 * Gets the coordinates for the given address.
	 * 
	 * @param address to get coordinates for.
	 * @return the coordinates corresponding to the given address.
	 */
	public Coordinates getCoordinates(String address) {
		return _gps.getCoordinates(address);
	}

	/**
	 * Gets the address for given coordinates.
	 * 
	 * @param coordinates to get the address for.
	 * @return the address corresponding to those coordinates.
	 */
	public String getAddress(Coordinates coordinates) {
		return _gps.getAddress(coordinates);
	}

}
