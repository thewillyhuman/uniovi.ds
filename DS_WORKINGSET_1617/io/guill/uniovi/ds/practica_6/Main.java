package io.guill.uniovi.ds.practica_6;

import io.guill.uniovi.ds.practica_6.components.MonumentMapElement;
import io.guill.uniovi.ds.practica_6.components.PhotoMapElement;
import io.guill.uniovi.ds.practica_6.components.RestaurantMapElement;
import io.guill.uniovi.ds.practica_6.model.Database;
import io.guill.uniovi.ds.practica_6.model.Monument;
import io.guill.uniovi.ds.practica_6.model.Photo;
import io.guill.uniovi.ds.practica_6.model.Restaurant;
import io.guill.uniovi.ds.practica_6.views.MapView;


public class Main {

	public static void main(String[] args) {

		Database db = new Database();
		MapView map = new MapView();

		// 1. Meter elementos en el mapa
		System.out.println("\n 1. Metiendo elementos en el mapa");

		for (Monument monumento : db.selectMonuments()) {
			 map.add(new MonumentMapElement(monumento));
		}

		for (Photo foto : db.selectPhotos()) {
			 map.add(new PhotoMapElement(foto));
		}

		for (Restaurant restaurante : db.selectRestaurant()) {
			 map.add(new RestaurantMapElement(restaurante));
		}

		// 2. En el mapa se dibujan los marcadores para los elementos añadidos al mapa
		System.out.println("\n 2. Mostrando mapa");
		map.draw();

		// 3. El usuario presiona brevemente la pantalla para recibir información de
		// cada elemento
		System.out.println("\n 3. Pulsación breve sobre cada elemento: información en tooltip");
		map.click(11, 11); // Nombre y autor del monumento (coliseo)
		map.click(21, 21); // Descripción de la foto y usuario que la ha subido
		map.click(31, 31); // Nombre y teléfono del restaurante

		// 4. El usuario deja pulsado un marcador para abrir un elemento
		System.out.println("\n 4. Pulsación larga sobre cada elemento: abrir elemento");
		map.longClick(11, 11); // Navegar hasta el coliseo con el GPS
		map.longClick(21, 21); // Bajarse foto
		map.longClick(31, 31); // Llamar al restaurante
	}

}
