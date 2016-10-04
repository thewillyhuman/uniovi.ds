package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;

public class CampoEdad extends Campo {
	
	public final static int LEGAL_AGE = 18;

	public CampoEdad(String etiqueta) {
		super(etiqueta);
	}

	/**
	 * @return true if the text is a number and this number is grater than the legal age. False otherwise.
	 */
	@Override
	public boolean checkInput() {
		return(new DigitValidator().validate(texto) && Integer.parseInt(texto) >= LEGAL_AGE);
	}

}
