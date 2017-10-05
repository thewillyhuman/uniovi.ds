package io.guill.uniovi.ds.practica3;

import java.io.*;
import io.guill.uniovi.ds.practica3.editor.*;

public class Main {

	public static void main(String[] args) throws IOException {
		new TextInterface(new InputStreamReader(System.in), new Editor(new Draw())).run();
	}
}
