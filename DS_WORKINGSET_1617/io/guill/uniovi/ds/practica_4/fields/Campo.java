package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.core.TextConsoleInterface;

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
		new TextConsoleInterface(this);
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
	 * Gives the name of the field.
	 * 
	 * @return the name of the field ad a string.
	 */
	public String getEtiqueta() {
		return this.etiqueta;
	}
	
	/**
	 * Gives the text entered in the field.
	 * 
	 * @param texto contained in the filed.
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * Checks the input of the field.
	 * 
	 * @return true if matches, false otherwise.
	 */
	public abstract boolean checkInput();

}
