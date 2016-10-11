package io.guill.uniovi.ds.practica_3.editor;

import java.util.*;

public class Dibujo {
	
	public void AddFigura(Figura figura) {
		figuras.add(figura);
	}
	
	public void dibuja() {
		for (Figura figura : figuras)
			figura.dibujar();
	}

	public Figura getFigura(int x, int y) {
		for (Figura figura : figuras)
			if (figura.contiene(x, y))
				return figura;
		return null;
	}
	
	public List<Figura> getFiguras() {
		List<Figura> aux = new ArrayList<Figura>();
		for(Figura f : figuras) {
			aux.add(f);
		} return aux;
	}

	List<Figura> figuras = new ArrayList<Figura>();
}
