package io.guill.uniovi.ds.practica10.game;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.platform.Image2D;
import io.guill.uniovi.ds.practica10.platform.android.AndroidAPI;

public class AndroidBallGame extends BallGame {

	public AndroidBallGame() {
		super(null);
	}

	@Override
	Image2D loadImage(String file) {
		return  new AndroidAPI().loadResource( file );
	}

	@Override
	Point getPosition() {
		return new AndroidAPI().getTouch();
	}

	@Override
	void drawBall(Image2D image, Point point) {
		new AndroidAPI().draw(point.x, point.y, image);
	} 
}
