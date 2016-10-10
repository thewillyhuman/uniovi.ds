package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;
import io.guill.uniovi.ds.practica_4.validators.LengthValidator;

public class CampoCodigoPostal extends Campo {
	
	public final static int LENGTH = 5;

	public CampoCodigoPostal(String etiqueta) {
		super(etiqueta);
	}

	/**
	 * @return true if the text contained has some determined length and is a completely digit. False otherwise.
	 */
	@Override
	public boolean checkInput() {
		return new LengthValidator(LENGTH).validate(texto) || new DigitValidator().validate(texto);
	}

}
