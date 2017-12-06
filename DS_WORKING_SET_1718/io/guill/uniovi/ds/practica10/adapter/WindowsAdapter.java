package io.guill.uniovi.ds.practica10.adapter;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.game.IBallGame;
import io.guill.uniovi.ds.practica10.platform.Image2D;
import io.guill.uniovi.ds.practica10.platform.windows.WindowsAPI;

public class WindowsAdapter extends WindowsAPI implements IBallGame {

	@Override
	public Image2D loadImage( String file ) {
		return super.loadFile( file );
	}

	@Override
	public void draw( int x, int y, Image2D image ) {
		super.paint( x, y, image );
	}

	@Override
	public Point getInteraction() {
		return super.getMouseClick();
	}

}
