package io.guill.uniovi.ds.practica10.adapter;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.game.IBallGame;
import io.guill.uniovi.ds.practica10.platform.Image2D;
import io.guill.uniovi.ds.practica10.platform.android.AndroidAPI;

public class AndroidAdapter extends AndroidAPI implements IBallGame {

	@Override
	public Image2D loadImage( String file ) {
		return super.loadResource( file );
	}

	@Override
	public void draw( int x, int y, Image2D image ) {
		super.draw( x, y, image );
	}

	@Override
	public Point getInteraction() {
		return super.getTouch();
	}

}
