package io.guill.uniovi.ds.practica6.views;

import java.awt.Rectangle;
import java.util.*;

import io.guill.uniovi.ds.practica6.components.*;

public class MapView {
	private List<MapElement> elements = new ArrayList<MapElement>();

	public void add(MapElement element) {
		elements.add(element);
	}

	public void draw() {
		for (MapElement element : elements)
			System.out.println(element.getTitle() + " " + element.getCoordinates());
	}

	public void userTouch(int x, int y) {
		MapElement element = getElementAt(x, y);
		if (element != null)
			System.out.println("Ventana flotante: " + element.getHTMLInfo());
	}

	public void userLongTouch(int x, int y) {
		MapElement element = getElementAt(x, y);
		if (element != null)
			element.open();
	}

	private MapElement getElementAt(int x, int y) {
		for (MapElement element : elements) {
			Coordinates coordinates = element.getCoordinates();
			Rectangle elementArea = new Rectangle((int) coordinates.getLongitude(), (int) coordinates.getLatitude(), 9, 9);
			if (elementArea.contains(x, y))
				return element;
		}
		return null;
	}

}
