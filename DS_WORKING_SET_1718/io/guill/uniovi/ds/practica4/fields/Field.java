package io.guill.uniovi.ds.practica4.fields;

import io.guill.uniovi.ds.practica4.TerminalInput;
import io.guill.uniovi.ds.practica4.validators.IValidator;

public class Field {

	protected String name, content;
	protected IValidator[] validators;

	public Field(String name, IValidator... validators) {
		this.name = name;
		this.validators = validators;
	}
	
	public String name() {
		return this.name;
	}
	
	public void name(String name) {
		this.name = name;
	}

	/**
	 * Asks for the input through the command line.
	 */
	public void input() {
		new TerminalInput(this);
	}
	
	public String content() {
		return content;
	}
	
	public void content(String content) {
		this.content = content;
	}

	/**
	 * Checks the input of the field.
	 * 
	 * @return true if matches, false otherwise.
	 */
	public boolean validate() {
		for(IValidator validator : validators) {
			if(!validator.validate(content)) {
				return false;
			}
		}
		return true;
	}
}
