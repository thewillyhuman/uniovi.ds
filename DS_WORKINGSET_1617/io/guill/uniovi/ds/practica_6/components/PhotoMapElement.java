package io.guill.uniovi.ds.practica_6.components;

import io.guill.uniovi.ds.practica_6.model.Photo;
import io.guill.uniovi.ds.practica_6.views.MapElement;

public class PhotoMapElement implements MapElement {
	
	private Photo photo;
	
	public PhotoMapElement(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String getName() {
		return this.photo.getDescription();
	}

	@Override
	public Coordinates getCoordinates() {
		return this.photo.getCoordinates();
	}

	@Override
	public String getTooltipInfo() {
		return this.photo.getUser() + ": " + this.photo.getDescription();
	}

	@Override
	public void open() {
		this.photo.show();

	}

}
