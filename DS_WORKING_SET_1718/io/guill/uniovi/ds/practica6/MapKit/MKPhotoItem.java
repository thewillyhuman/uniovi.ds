package io.guill.uniovi.ds.practica6.MapKit;

import io.guill.uniovi.ds.practica6.components.Coordinates;
import io.guill.uniovi.ds.practica6.model.Photo;

public class MKPhotoItem implements MKMapItem {

	private Photo photo;

	public MKPhotoItem(Photo photo) {
		this.photo = photo;
	}

	@Override
	public String placemark() {
		return this.photo.getDescription();
	}

	@Override
	public Coordinates coordinates() {
		return this.photo.getCoordinates();
	}

	@Override
	public String annotations() {
		return this.photo.getUser() + ": " + this.photo.getDescription();
	}

	@Override
	public void open() {
		this.photo.show();

	}

}
