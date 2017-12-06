package io.guill.uniovi.ds.practica10.game;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.platform.Image2D;
import io.guill.uniovi.ds.practica10.platform.windows.WindowsAPI;

public class WindowsBallGame extends BallGame {

	public WindowsBallGame() {
		super();
	}

	@Override
	Image2D loadImage(String file) {
		return new WindowsAPI().loadFile(file);
	}

	@Override
	Point getPosition() {
		return new WindowsAPI().getMouseClick();
	}

	@Override
	void drawBall(Image2D image, Point point) {
		new WindowsAPI().paint(point.x, point.y, image);
	}

}
