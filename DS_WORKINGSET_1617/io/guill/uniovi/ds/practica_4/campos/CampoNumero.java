package io.guill.uniovi.ds.practica_4.campos;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;

public class CampoNumero extends Campo {

	public CampoNumero(String etiqueta) {
		super(etiqueta);
	}

	@Override
	protected boolean checkInput() {
		return new DigitValidator().validate(texto);
	}
}
