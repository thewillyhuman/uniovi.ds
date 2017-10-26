package io.guill.uniovi.ds.practica3.tools;

import java.awt.Point;
import io.guill.uniovi.ds.practica3.editor.Editor;
import io.guill.uniovi.ds.practica3.shapes.IShape;
import io.guill.uniovi.ds.practica5.Historical;
import io.guill.uniovi.ds.practica5.State;

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
		Historical.instance.instance().newState(new State(editor.canvas()));
		System.err.println("Action not implemented yet");
	}

	public void release(int x, int y) {
		second = new Point(x, y);
		IShape shape = createWithState(first, second);
		editor.canvas().addShape(shape);
		editor.terminateTool();
	}
	
	private IShape createWithState(Point first, Point second) {
		Historical.instance.instance().newState(new State(editor.canvas()));
		return create(first, second);
	}
	
	protected abstract IShape create(Point first, Point second);

}
