package io.guill.uniovi.ds.practica_11.template.platform.windows;

import io.guill.uniovi.ds.practica_11.adapter.platform.Image2D;
import io.guill.uniovi.ds.practica_11.template.platform.Platform;

import java.awt.Point;


public class WindowsAPI extends Platform {

	@Override
	public Image2D loadImage(String file) {
		System.out.println("(Windows) Cargada imagen '" + file + "' del disco duro.");
		return new Image2D(file, 10, 10);
	}

	@Override
	public void drawBall(Image2D image, Point point) {
		System.out.println("(Windows) Dibujando '" + image.getName() + "' en [" + point.x + "," + point.y + "]");
		
	}

}
