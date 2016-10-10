package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;

public class CampoNumero extends Campo {

	public CampoNumero(String etiqueta) {
		super(etiqueta);
	}

	/**
	 * @return true if the text is a number. False otherwise.
	 */
	@Override
	public boolean checkInput() {
		return new DigitValidator().validate(texto);
	}
}
