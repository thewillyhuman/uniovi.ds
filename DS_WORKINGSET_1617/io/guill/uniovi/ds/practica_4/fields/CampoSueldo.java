package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;

public class CampoSueldo extends Campo {
	
	public final static int LOW_SALARY_LIMIT = 800;
	public final static int UPPER_SALARY_LIMIT = 1200;

	public CampoSueldo(String etiqueta) {
		super(etiqueta);
	}

	/**
	 * @return true if the text is a number and this number is between 800 and 1200. False otherwise.
	 */
	@Override
	public boolean checkInput() {
		return (new DigitValidator().validate(texto) && Integer.parseInt(texto) > LOW_SALARY_LIMIT && Integer.parseInt(texto) < UPPER_SALARY_LIMIT);
	}

}
