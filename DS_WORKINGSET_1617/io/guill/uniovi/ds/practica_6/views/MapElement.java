package io.guill.uniovi.ds.practica_6.views;

import io.guill.uniovi.ds.practica_6.components.Coordinates;


public interface MapElement {
	
	String getName();

	Coordinates getCoordinates();

	String getTooltipInfo();

	void open();
}
