package io.guill.uniovi.ds.practica10.game;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.platform.Image2D;

public abstract class BallGame {
	
	private IBallGame platform;
	
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

	/*private void setAPI(IBallGame platform) {
		this.platform = platform;
	}*/

	abstract Image2D loadImage(String file);/* {
		return platform.loadImage( file );
	}*/

	abstract Point getPosition();/* {
		return this.platform.getInteraction();
	}*/

	abstract void drawBall(Image2D image, Point point);/* {
		this.platform.draw( point.x, point.y, image );
	}*/

}
