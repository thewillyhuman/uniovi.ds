package io.guill.uniovi.ds.practica6.MapKit;

import io.guill.uniovi.ds.practica6.components.Coordinates;
import io.guill.uniovi.ds.practica6.model.Monument;

public class MKMonumentItem implements MKMapItem {

	private Monument monument;
	
	public MKMonumentItem(Monument monument) {
		this.monument = monument;
	}

	@Override
	public String placemark() {
		return monument.getName();
	}

	@Override
	public Coordinates coordinates() {
		return new MKDirectionsRequest().getCoordinates(this.monument.getAddress());
	}

	@Override
	public String annotations() {
		return this.monument.getAuthor()+": "+this.monument.getName();
	}

	@Override
	public void open() {
		System.out.print("> ");
		new MKDirectionsRequest().navigate(this.monument.getAddress());
	}

}
