package io.guill.uniovi.ds.practica10.platform.android;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.platform.Image2D;


public class AndroidAPI {
	private Point point = new Point(0, 0);
	
	public Image2D loadResource( String file ) {
		System.out.println("(Android) Cargada imagen '" + file + "' de la memoria flash.");
		return new Image2D(file, 10, 10);
	}
	
	public Point getTouch() {
		point.translate(10, 10);
		return new Point(point);
	}

	public void draw(int x, int y, Image2D image) {
		System.out.println("(Android) Dibujando '" + image.getName() + "' en [" + x + "," + y + "]");
	}
}
