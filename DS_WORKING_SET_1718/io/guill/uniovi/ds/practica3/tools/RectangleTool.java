package io.guill.uniovi.ds.practica3.tools;

import java.awt.Point;

import io.guill.uniovi.ds.practica3.editor.Editor;
import io.guill.uniovi.ds.practica3.shapes.IShape;
import io.guill.uniovi.ds.practica3.shapes.Rectangle;

public class RectangleTool extends CreationTool {

	public RectangleTool(Editor editor) {
		super(editor);
	}

	@Override
	protected IShape create(Point first, Point second) {
		return new Rectangle(first, second);
	}

}
