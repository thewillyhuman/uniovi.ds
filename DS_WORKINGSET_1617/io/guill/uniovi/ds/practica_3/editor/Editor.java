package io.guill.uniovi.ds.practica_3.editor;

import io.guill.uniovi.ds.practica_3.tools.Herramienta;
import io.guill.uniovi.ds.practica_3.tools.HerramientaSeleccion;

public class Editor {

	public Editor(Dibujo dibujo) {
		setDibujo(dibujo);
		actual = principal = createDefaultTool();
	}

	public void setDibujo(Dibujo dibujo) {
		this.dibujo = dibujo;
	}

	public Dibujo getDibujo() {
		return dibujo;
	}

	public void dibujar() {
		System.out.println("Herramienta: " + actual);
		dibujo.dibuja();
	}

	// Herramientas -------------------
	protected Herramienta createDefaultTool() {
		return new HerramientaSeleccion(this);
	}

	public Herramienta getDefaultTool() {
		return principal;
	}

	public void setHerramienta(Herramienta herramienta) {
		if (herramienta != null)
			this.actual = herramienta;
	}

	public void pinchar(int x, int y) {
		actual.pinchar(x, y);
	}

	public void mover(int x, int y) {
		actual.mover(x, y);
	}

	public void soltar(int x, int y) {
		actual.soltar(x, y);
	}

	public void finHerramienta() {
		actual = principal;
	}

	private Dibujo dibujo;
	private Herramienta actual;
	private Herramienta principal;
}