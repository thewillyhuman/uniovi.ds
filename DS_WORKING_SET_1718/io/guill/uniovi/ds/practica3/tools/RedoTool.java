package io.guill.uniovi.ds.practica3.tools;

import io.guill.uniovi.ds.practica3.editor.Editor;
import io.guill.uniovi.ds.practica5.Historical;

public class RedoTool {

	private Editor editor;
	
	public RedoTool(Editor editor) {
		this.editor = editor;
	}
	
	public void redo() {
		this.editor.canvas().shapes(Historical.instance.instance().redo().state());
	}

}
