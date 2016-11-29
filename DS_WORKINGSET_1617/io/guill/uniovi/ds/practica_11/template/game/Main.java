package io.guill.uniovi.ds.practica_11.template.game;

import io.guill.uniovi.ds.practica_11.template.platform.android.AndroidAPI;
import io.guill.uniovi.ds.practica_11.template.platform.playstation.Playstation5API;
import io.guill.uniovi.ds.practica_11.template.platform.windows.WindowsAPI;

public class Main {
	public static void main(String[] args) {
		BallGame game = new BallGame();
		game.play(new AndroidAPI());
		game.play(new Playstation5API());
		game.play(new WindowsAPI());
	}
}
