package io.guill.uniovi.ds.practica6.MapKit;

import io.guill.uniovi.ds.practica6.components.*;

public interface MKMapItem {
	
	String placemark();

	Coordinates coordinates();

	String annotations();

	void open();
}
