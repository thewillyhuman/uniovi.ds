package io.guill.uniovi.ds.practica_11.adapter.game;

import io.guill.uniovi.ds.practica_11.adapter.api.PlatformAPI;
import io.guill.uniovi.ds.practica_11.adapter.platform.Image2D;
import io.guill.uniovi.ds.practica_11.adapter.platform.android.AndroidAPI;
import io.guill.uniovi.ds.practica_11.adapter.platform.playstation.Playstation5API;
import io.guill.uniovi.ds.practica_11.adapter.platform.windows.WindowsAPI;

import java.awt.Point;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */

enum Platform {
	ANDROID, WINDOWS, PLAYSTATION
};

public class BallGame {

	// Seleccionar para qué plataforma se quiere generar el juego
	private Platform platformTAG = Platform.ANDROID;
	// private Platform platform = Platform.WINDOWS;
	// private Platform platform = Platform.PLAYSTATION;

	private PlatformAPI platform;

	public void play() {

		// Inicializar la API adecuada
		setAPI();

		Image2D image = loadImage("Bola.jpg");

		// Lógica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra lógica del juego...
			drawBall(image, point);
		}
	}

	private void setAPI() {
		if (platformTAG == Platform.ANDROID)
			platform = new AndroidAPI();
		else if (platformTAG == Platform.WINDOWS)
			platform = new WindowsAPI();
		else
			platform = new Playstation5API();
	}

	
	private Image2D loadImage(String file) {
		return platform.loadImage(file);
	}

	private Point getPosition() {
		return platform.getPosition();
	}

	private void drawBall(Image2D image, Point point) {
		platform.drawBall(image, point);
	}

}
