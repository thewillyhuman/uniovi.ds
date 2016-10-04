package io.guill.uniovi.ds.practica_4.campos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Basic field.
 * @author Guillermo Facundo Colunga
 */
public abstract class Campo {

	protected String etiqueta;
	protected String texto;

	public Campo(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	/**
	 * Asks for the input through the command line.
	 */
	public void pideDato() {
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));

		boolean valido;
		do {
			valido = false;
			try {
				System.out.print(etiqueta + ": ");
				texto = consola.readLine();

				valido = checkInput();

			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valido);
	}

	/**
	 * Returns the string of the input.
	 * 
	 * @return string of the input.
	 */
	public String getString() {
		return texto;
	}

	/**
	 * Checks the input of the field.
	 * 
	 * @return true if matches, false otherwise.
	 */
	protected abstract boolean checkInput();

}
