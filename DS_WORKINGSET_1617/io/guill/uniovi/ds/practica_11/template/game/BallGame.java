package io.guill.uniovi.ds.practica_11.template.game;

import io.guill.uniovi.ds.practica_11.adapter.platform.Image2D;
import io.guill.uniovi.ds.practica_11.template.platform.Platform;

import java.awt.Point;

/* Esta clase/paquete sería el código del videojuego, el cual se quiere reutilizar
 * en las distintas plataformas 
 */
public class BallGame {

	// Seleccionar para qué plataforma se quiere generar el juego

	public void play(Platform platform) {

		Image2D image = platform.loadImage("Bola.jpg");

		// Lógica principal del juego
		for (int i = 0; i < 10; i++) {
			Point point = platform.getPosition();
			// Comprobar colisiones...
			// Imprimir marcador...
			// Otra lógica del juego...
			// Calling to the play method.
			platform.drawBall(image, point);
		}
	}
}
