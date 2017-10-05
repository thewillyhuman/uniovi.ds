package io.guill.uniovi.ds.practica3.editor;

import io.guill.uniovi.ds.practica3.tools.ITool;
import io.guill.uniovi.ds.practica3.tools.SelectionTool;

public class Editor {
	
	private Draw draw;
	private ITool actual, def;

	public Editor(Draw dibujo) {
		canvas(dibujo);
		actual = def = createDefaultTool();
	}

	public void canvas(Draw dibujo) {
		this.draw = dibujo;
	}

	public Draw canvas() {
		return draw;
	}

	public void dibujar() {
		System.out.println("Herramienta: " + actual);
		draw.draw();
	}

	// Tools -------------------
	protected ITool createDefaultTool() {
		return new SelectionTool(this);
	}

	public ITool defaultTool() {
		return def;
	}

	public void setTool(ITool herramienta) {
		if (herramienta != null)
			this.actual = herramienta;
	}

	public void click(int x, int y) {
		actual.click(x, y);
	}

	public void move(int x, int y) {
		actual.move(x, y);
	}

	public void release(int x, int y) {
		actual.release(x, y);
	}

	public void terminateTool() {
		actual = def;
	}
}
