package io.guill.uniovi.ds.practica_3.herramientas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import io.guill.uniovi.ds.practica_3.figuras.Cuadrado;

public class CuadradoTool implements ComandLineTool {
	
	private Cuadrado newRectangle = null;
	private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public void run() throws IOException {
		System.out.println("Pinch and draw your rectangle");
		System.out.print("> ");
		String[] line = in.readLine().split("[ ,]");
	}
	
}
