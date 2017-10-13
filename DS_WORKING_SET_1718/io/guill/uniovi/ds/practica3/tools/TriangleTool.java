package io.guill.uniovi.ds.practica3.tools;

import java.awt.Point;

import io.guill.uniovi.ds.practica3.editor.Editor;
import io.guill.uniovi.ds.practica3.shapes.Triangle;

public class TriangleTool implements ITool {

	private Editor editor;
	private int corner = 0;
	private Point[] corners = new Point[3];
	
	public TriangleTool(Editor editor) {
		this.editor = editor;
	}
	
	@Override
	public void click(int x, int y) {
		corners[corner++] = new Point(x,y);
		if (corner == 3) {
			editor.canvas().addShape(new Triangle(corners[0], corners[1], corners[2]));
			corner = 0;
			editor.terminateTool();
		}
	}

	@Override
	public void move(int x, int y) { }

	@Override
	public void release(int x, int y) { }

}
