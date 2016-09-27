package io.guill.uniovi.ds.practica_3.editor;

import java.util.ArrayList;
import java.util.List;

public class Dibujo {
	
	private List<Figura> figuras = new ArrayList<Figura>();

	public void dibujar() {
		System.out.println("Estoy vacio (por ahora)");
	}
	
	public void addFigura(Figura figura) {
		figuras.add(figura);
	}
	
	public void deleteFigura(Figura figura) {
		figuras.remove(figura);
	}

}
