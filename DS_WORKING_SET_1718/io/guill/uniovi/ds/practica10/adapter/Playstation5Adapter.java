package io.guill.uniovi.ds.practica10.adapter;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.game.IBallGame;
import io.guill.uniovi.ds.practica10.platform.Image2D;
import io.guill.uniovi.ds.practica10.platform.playstation.Playstation5API;

public class Playstation5Adapter extends Playstation5API implements IBallGame {

	@Override
	public Image2D loadImage( String file ) {
		return super.loadGraphics( file );
	}

	@Override
	public void draw( int x, int y, Image2D image ) {
		super.render( x, y, image );
		
	}

	@Override
	public Point getInteraction() {
		return super.getJoystick();
	}

}
