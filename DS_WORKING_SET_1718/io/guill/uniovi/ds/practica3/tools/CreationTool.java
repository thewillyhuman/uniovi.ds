package io.guill.uniovi.ds.practica3.tools;

import java.awt.Point;
import io.guill.uniovi.ds.practica3.editor.Editor;
import io.guill.uniovi.ds.practica3.shapes.IShape;

public abstract class CreationTool implements ITool {
	
	Editor editor;
	private Point first, second;
	
	public CreationTool(Editor editor) {
		this.editor = editor;
	}
	
	public void click(int x, int y) {
		first = new Point(x, y);
	}

	public void move(int x, int y) {
		System.err.println("Action not implemented yet");
	}

	public void release(int x, int y) {
		second = new Point(x, y);
		IShape shape = create(first, second);
		editor.canvas().addShape(shape);
		editor.terminateTool();
	}
	
	protected abstract IShape create(Point first, Point second);

}
