package io.guill.uniovi.ds.practica6.MapKit;

import java.awt.Rectangle;
import java.util.*;

import io.guill.uniovi.ds.practica6.components.*;

public class MKMapView {
	private List<MKMapItem> elements = new ArrayList<MKMapItem>();

	public void add(MKMapItem element) {
		elements.add(element);
	}

	public void draw() {
		for (MKMapItem element : elements)
			System.out.println(element.placemark() + " " + element.coordinates());
	}

	public void userTouch(int x, int y) {
		MKMapItem element = getElementAt(x, y);
		if (element != null)
			System.out.println("Ventana flotante: " + element.annotations());
	}

	public void userLongTouch(int x, int y) {
		MKMapItem element = getElementAt(x, y);
		if (element != null)
			element.open();
	}

	private MKMapItem getElementAt(int x, int y) {
		for (MKMapItem element : elements) {
			Coordinates coordinates = element.coordinates();
			Rectangle elementArea = new Rectangle((int) coordinates.getLongitude(), (int) coordinates.getLatitude(), 9, 9);
			if (elementArea.contains(x, y))
				return element;
		}
		return null;
	}

}
