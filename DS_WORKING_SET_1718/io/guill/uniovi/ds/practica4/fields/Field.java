package io.guill.uniovi.ds.practica4.fields;

import io.guill.uniovi.ds.practica4.TerminalInput;

public abstract class Field {

	protected String name, content;

	public Field(String etiqueta) {
		this.name = etiqueta;
	}

	/**
	 * Asks for the input through the command line.
	 */
	public void input() {
		new TerminalInput(this);
	}

	/**
	 * Returns the string of the input.
	 * 
	 * @return string of the input.
	 */
	public String content() {
		return content;
	}

	/**
	 * Gives the name of the field.
	 * 
	 * @return the name of the field ad a string.
	 */
	public String name() {
		return this.name;
	}

	/**
	 * Gives the text entered in the field.
	 * 
	 * @param texto contained in the filed.
	 */
	public void name(String texto) {
		this.content = texto;
	}

	/**
	 * Checks the input of the field.
	 * 
	 * @return true if matches, false otherwise.
	 */
	public abstract boolean checkInput();
}
