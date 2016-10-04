package io.guill.uniovi.ds.practica_3.figuras;


import io.guill.uniovi.ds.practica_3.editor.Editor;
import io.guill.uniovi.ds.practica_3.editor.Figura;
import io.guill.uniovi.ds.practica_3.herramientas.HerramientaCreacion;
import java.awt.Point;



public class HerramientaCuadrado extends HerramientaCreacion {

	public HerramientaCuadrado(Editor editor) {
		super(editor);
	}

	protected Figura doCreaFigura(Point inicio, Point fin) {
		return new Cuadrado(inicio, fin);
	}
}
