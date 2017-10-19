package io.guill.uniovi.ds.practica3.tools;

import java.awt.Point;

import io.guill.uniovi.ds.practica3.editor.Editor;
import io.guill.uniovi.ds.practica3.shapes.Circle;
import io.guill.uniovi.ds.practica3.shapes.IShape;

public class CircleTool extends CreationTool {

	public CircleTool(Editor editor) {
		super(editor);
	}

	@Override
	protected IShape create(Point first, Point second) {
		Point centro = new Point((first.x + second.x) / 2, (first.y + second.y) / 2);
		int radio = Math.max(second.x - first.x, second.y - first.y) / 2;
		return new Circle(centro, radio);
	}
}
