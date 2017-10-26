package io.guill.uniovi.ds.practica3.tools;

import io.guill.uniovi.ds.practica3.editor.Editor;
import io.guill.uniovi.ds.practica5.Historical;

public class UndoTool {
	
	private Editor editor;
	
	public UndoTool(Editor editor) {
		this.editor = editor;
	}
	
	public void undo() {
		this.editor.canvas().shapes(Historical.instance.instance().undo().state());
	}

}
