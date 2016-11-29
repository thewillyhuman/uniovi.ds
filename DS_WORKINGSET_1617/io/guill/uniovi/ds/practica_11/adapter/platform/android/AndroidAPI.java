package io.guill.uniovi.ds.practica_11.adapter.platform.android;

import io.guill.uniovi.ds.practica_11.adapter.api.PlatformAPI;
import io.guill.uniovi.ds.practica_11.adapter.platform.Image2D;

import java.awt.Point;

public class AndroidAPI implements PlatformAPI {
	
	private Point point = new Point(0, 0);

	@Override
	public Image2D loadImage(String file) {
		System.out.println("(Android) Cargada imagen '" + file + "' de la memoria flash.");
		return new Image2D(file, 10, 10);
	}

	@Override
	public Point getPosition() {
		point.translate(10, 10);
		return new Point(point);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		System.out.println("(Android) Dibujando '" + image.getName() + "' en [" + point.x + "," + point.y + "]");
	}
}
