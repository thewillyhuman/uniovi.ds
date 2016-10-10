package io.guill.uniovi.ds.practica_3.main;
import java.io.*;

import io.guill.uniovi.ds.practica_3.editor.Dibujo;
import io.guill.uniovi.ds.practica_3.editor.Editor;


public class Main {

	public static void main(String[] args) throws IOException {
		Editor editor = new Editor(new Dibujo());
		TextModeInterface userInterface = new TextModeInterface(new InputStreamReader(System.in), editor);
		userInterface.run();
	}

}
