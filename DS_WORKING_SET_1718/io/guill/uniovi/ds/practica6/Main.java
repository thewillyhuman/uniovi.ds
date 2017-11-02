package io.guill.uniovi.ds.practica6;

import io.guill.uniovi.ds.practica6.model.*;
import io.guill.uniovi.ds.practica6.views.*;

public class Main {

	public static void main(String[] args) {

		MapView map = new MapView();

		// 1. Meter elementos en el mapa
		System.out.println("\n 1. Metiendo elementos en el mapa");
		for (Monument monumento : Database.instance.monuments()) {
			 map.add(new MonumentMapElement(monumento));
		}

		for (Photo foto : Database.instance.photos()) {
			 map.add(new PhotoMapElement(foto));
		}

		for (Restaurant restaurante : Database.instance.restaurants()) {
			 map.add(new RestaurantMapElement(restaurante));
		}
		

		// 2. En el mapa se dibujan marcadores para el coliseo, la foto y un restaurante
		System.out.println("\n 2. Mostrando mapa");
		map.draw();

		// 3. El usuario presiona brevemente la pantalla para recibir informaci�n de
		// cada elemento
		System.out.println("\n 3. Pulsación breve sobre cada elemento: información en tooltip");
		map.userTouch(11, 11); // Info resumida del coliseo
		map.userTouch(21, 21); // Info de la foto
		map.userTouch(31, 31); // Info del restaurante

		// 4. El usuario deja pulsado un marcador para abrir un elemento
		System.out.println("\n 4. Pulsación larga sobre cada elemento: abrir elemento");
		map.userLongTouch(11, 11); // Navegar hasta el coliseo con el GPS
		map.userLongTouch(21, 21); // Bajarse foto
		map.userLongTouch(31, 31); // Llamar al restaurante
	}

}
