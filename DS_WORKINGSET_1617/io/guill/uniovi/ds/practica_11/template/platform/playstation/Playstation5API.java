package io.guill.uniovi.ds.practica_11.template.platform.playstation;

import io.guill.uniovi.ds.practica_11.adapter.platform.Image2D;
import io.guill.uniovi.ds.practica_11.template.platform.Platform;

import java.awt.Point;


public class Playstation5API extends Platform {

	@Override
	public Image2D loadImage(String file) {
		System.out.println("(PS5) Cargada imagen '" + file + "' del DVD.");
		return new Image2D(file, 10, 10);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		System.out.println("(PS5) Dibujando '" + image.getName() + "' en [" + point.x + "," + point.y + "]");
	}

}
