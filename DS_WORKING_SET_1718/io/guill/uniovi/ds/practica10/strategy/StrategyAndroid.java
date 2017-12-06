package io.guill.uniovi.ds.practica10.strategy;

import java.awt.Point;

import io.guill.uniovi.ds.practica10.platform.Image2D;
import io.guill.uniovi.ds.practica10.platform.android.AndroidAPI;

public class StrategyAndroid implements BallGameLoadImageStrategy, BallGameDrawStrategy, BallGameInteractStrategy {

	@Override
	public Point getInteraction() {
		return new AndroidAPI().getTouch();
	}

	@Override
	public void draw( int x, int y, Image2D image ) {
		
	}

	@Override
	public Image2D loadImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
