package io.guill.uniovi.ds.practica10.game;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.platform.Image2D;

// If the second implementation were the only and final one this class would be abstract.
public class BallGame {

	private IBallGame platform;

	public BallGame() {}

	public BallGame(IBallGame platform) {
		this.platform = platform;
	}

	public void play() {
		Image2D image = loadImage("Bola.jpg");

		// Main game logic.
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			drawBall(image, point);
		}
	}

	// And those three methods will have no implementation --> abstract.

	Image2D loadImage(String file) {
		return platform.loadImage(file);
	}

	Point getPosition() {
		return this.platform.getInteraction();
	}

	void drawBall(Image2D image, Point point) {
		this.platform.draw(point.x, point.y, image);
	}

}
