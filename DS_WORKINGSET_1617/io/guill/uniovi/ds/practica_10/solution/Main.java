package io.guill.uniovi.ds.practica_10.solution;

import io.guill.uniovi.ds.practica_10.solution.editor.Editor;
import io.guill.uniovi.ds.practica_10.solution.editor.ui.EditorTextUI;

import java.io.*;

public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		Editor editor = new Editor();
		EditorTextUI console = new EditorTextUI(editor);
		
		console.run();
	}
}