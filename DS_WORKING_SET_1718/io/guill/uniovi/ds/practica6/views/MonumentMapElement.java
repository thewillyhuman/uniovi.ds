package io.guill.uniovi.ds.practica6.views;

import io.guill.uniovi.ds.practica6.components.Coordinates;
import io.guill.uniovi.ds.practica6.components.GPS;
import io.guill.uniovi.ds.practica6.model.Monument;

public class MonumentMapElement implements MapElement {

	private Monument monument;
	
	public MonumentMapElement(Monument monument) {
		this.monument = monument;
	}

	@Override
	public String getTitle() {
		return monument.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return GPS.instance.getCoordinates(this.monument.getAddress());
	}

	@Override
	public String getHTMLInfo() {
		return this.monument.getAuthor()+": "+this.monument.getName();
	}

	@Override
	public void open() {
		System.out.print("> ");
		GPS.instance.navigate(this.monument.getAddress());
	}

}
