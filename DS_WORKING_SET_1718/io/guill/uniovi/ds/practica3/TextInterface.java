package io.guill.uniovi.ds.practica3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

import io.guill.uniovi.ds.practica3.editor.Editor;
import io.guill.uniovi.ds.practica3.tools.*;

public class TextInterface {
	
	private Editor editor;
	private BufferedReader in;
	private ITool circulo, cuadrado, triangulo;
	
	public TextInterface(Reader input, Editor editor) {
		in = new BufferedReader(input);
		this.editor = editor;
		creaHerramientas();
	}

	private void creaHerramientas() {
		circulo = new CircleTool(editor);
		cuadrado = new RectangleTool(editor);
		triangulo = new TriangleTool(editor);
	}

	public void run() throws IOException {
		System.out.println("Tool Commans: cuadrado, circulo, triangulo, seleccion");
		System.out.println("Mouse Commands: pinchar x,y / mover x,y / soltar x,y");
		System.out.println("Other Commands: dibujar, exit");
		do {
			System.out.print(">");
			String[] line = in.readLine().split("[ ,]");
			if (line[0].equals("exit"))
				return;
			if (line[0].equals("cuadrado"))
				editor.setTool(cuadrado);
			else if (line[0].equals("circulo"))
				editor.setTool(circulo);
			else if (line[0].equals("triangulo"))
				editor.setTool(triangulo);
			else if (line[0].equals("seleccion"))
				editor.setTool(editor.defaultTool());
			else if (line[0].equals("pinchar"))
				editor.click(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			else if (line[0].equals("mover"))
				editor.move(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			else if (line[0].equals("soltar"))
				editor.release(Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			else if (line[0].equals("dibujar"))
				editor.dibujar();
			else
				System.out.println("Order not found # Error 404 JEJEJE");

		} while (true);
	}

}
