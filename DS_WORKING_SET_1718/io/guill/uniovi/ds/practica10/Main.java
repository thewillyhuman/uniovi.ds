package io.guill.uniovi.ds.practica10;

import io.guill.uniovi.ds.practica10.adapter.AndroidAdapter;
import io.guill.uniovi.ds.practica10.adapter.Playstation5Adapter;
import io.guill.uniovi.ds.practica10.adapter.WindowsAdapter;
import io.guill.uniovi.ds.practica10.game.BallGame;

public class Main {
	
	public static void main(String[] args) {
		
		// Creating a game in an Android API.
		BallGame game = new BallGame(new AndroidAdapter());
		game.play();
		
		// Creating a game in PlayStation.
		game = new BallGame(new Playstation5Adapter());
		game.play();
		
		// Creating a game in Windows.
		game = new BallGame(new WindowsAdapter());
		game.play();
	}
}
