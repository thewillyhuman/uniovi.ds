package io.guill.uniovi.ds.practica_6.components;

import io.guill.uniovi.ds.practica_6.model.Monument;
import io.guill.uniovi.ds.practica_6.views.MapElement;

public class MonumentMapElement implements MapElement {
	
	private Monument monument;
	
	public MonumentMapElement(Monument monument) {
		this.monument = monument;
	}

	@Override
	public String getName() {
		return monument.getName();
	}

	@Override
	public Coordinates getCoordinates() {
		return new GPS().getCoordinates(this.monument.getAddress());
	}

	@Override
	public String getTooltipInfo() {
		return this.monument.getAuthor()+": "+this.monument.getName();
	}

	@Override
	public void open() {
		System.out.print("> ");
		new GPS().navigate(this.monument.getAddress());
	}
}
