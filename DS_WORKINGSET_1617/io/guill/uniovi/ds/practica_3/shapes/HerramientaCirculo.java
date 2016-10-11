package io.guill.uniovi.ds.practica_3.shapes;

import io.guill.uniovi.ds.practica_3.editor.Editor;
import io.guill.uniovi.ds.practica_3.editor.Figura;
import io.guill.uniovi.ds.practica_3.tools.HerramientaCreacion;

import java.awt.Point;



public class HerramientaCirculo extends HerramientaCreacion {

	public HerramientaCirculo(Editor editor) {
		super(editor);
	}

	protected Figura doCreaFigura(Point inicio, Point fin) {
		Point centro = new Point((inicio.x + fin.x) / 2, (inicio.y + fin.y) / 2);
		int radio = Math.max(fin.x - inicio.x, fin.y - inicio.y) / 2;
		return new Circulo(centro, radio);
	}
}
