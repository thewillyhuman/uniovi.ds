package io.guill.uniovi.ds.practica_11.template.platform;

import java.awt.Point;

import io.guill.uniovi.ds.practica_11.adapter.api.PlatformAPI;
import io.guill.uniovi.ds.practica_11.adapter.platform.Image2D;

public abstract class Platform implements PlatformAPI {
	
	private Point point = new Point(0, 0);
	
	@Override
	public abstract Image2D loadImage(String file);
	
	@Override
	public abstract void drawBall(Image2D image, Point point);

	@Override
	public Point getPosition() {
		point.translate(10, 10);
		return new Point(point);
	}

}
