package io.guill.uniovi.ds.practica3.tools;

import java.awt.Point;

import io.guill.uniovi.ds.practica3.editor.Editor;
import io.guill.uniovi.ds.practica3.shapes.IShape;

public class SelectionTool implements ITool {
	
	private Editor editor;
	private IShape selected;
	private Point position;

	public SelectionTool(Editor editor) {
		this.editor = editor;
	}
	
	@Override
	public void click(int x, int y) {
		selected = editor.canvas().shapeAt(x, y);
		position = new Point(x, y);
	}

	@Override
	public void move(int x, int y) {
		this.incrementPosition(x, y);

	}

	@Override
	public void release(int x, int y) {
		this.incrementPosition(x, y);
	}
	
	/**
	 * Increments the position.
	 * 
	 * @param x coordinate.
	 * @param y coordinate.
	 */
	private void incrementPosition(int x, int y) {
		if (selected != null) {
			selected.move(x - position.x, y - position.y);
			position = new Point(x, y);
		}
	}

}
