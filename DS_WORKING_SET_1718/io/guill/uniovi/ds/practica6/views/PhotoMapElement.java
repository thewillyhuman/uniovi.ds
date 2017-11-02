package io.guill.uniovi.ds.practica6.views;

import io.guill.uniovi.ds.practica6.components.Coordinates;
import io.guill.uniovi.ds.practica6.model.Photo;

public class PhotoMapElement implements MapElement {

	private Photo photo;

	public PhotoMapElement(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String getTitle() {
		return this.photo.getDescription();
	}

	@Override
	public Coordinates getCoordinates() {
		return this.photo.getCoordinates();
	}

	@Override
	public String getHTMLInfo() {
		return this.photo.getUser() + ": " + this.photo.getDescription();
	}

	@Override
	public void open() {
		this.photo.show();

	}

}
