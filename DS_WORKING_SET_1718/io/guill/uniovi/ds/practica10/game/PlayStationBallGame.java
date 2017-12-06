package io.guill.uniovi.ds.practica10.game;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.platform.Image2D;
import io.guill.uniovi.ds.practica10.platform.playstation.Playstation5API;

public class PlayStationBallGame extends BallGame {

	public PlayStationBallGame() {
		super();
	}

	@Override
	Image2D loadImage(String file) {
		return new Playstation5API().loadGraphics(file);
	}

	@Override
	Point getPosition() {
		return new Playstation5API().getJoystick();
	}

	@Override
	void drawBall(Image2D image, Point point) {
		new Playstation5API().render(point.x, point.y, image);
	}

}
