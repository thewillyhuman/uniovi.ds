package io.guill.uniovi.ds.practica_11.template.platform.android;

import io.guill.uniovi.ds.practica_11.adapter.platform.Image2D;
import io.guill.uniovi.ds.practica_11.template.platform.Platform;

import java.awt.Point;

public class AndroidAPI extends Platform {

	@Override
	public Image2D loadImage(String file) {
		System.out.println("(Android) Cargada imagen '" + file + "' de la memoria flash.");
		return new Image2D(file, 10, 10);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		System.out.println("(Android) Dibujando '" + image.getName() + "' en [" + point.x + "," + point.y + "]");
	}
}
