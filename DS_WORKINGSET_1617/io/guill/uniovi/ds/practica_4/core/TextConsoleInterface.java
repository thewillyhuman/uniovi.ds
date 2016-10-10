package io.guill.uniovi.ds.practica_4.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import io.guill.uniovi.ds.practica_4.fields.Campo;

public class TextConsoleInterface {

	public TextConsoleInterface(Campo campo) {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
		boolean valido;
		do {
			valido = false;
			try {
				System.out.print(campo.getEtiqueta() + ": ");
				campo.setTexto(consola.readLine());
				valido = campo.checkInput();
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}
}
