package io.guill.uniovi.ds.practica_4.campos;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;

public class CampoSueldo extends Campo {

	public CampoSueldo(String etiqueta) {
		super(etiqueta);
	}

	@Override
	protected boolean checkInput() {
		return (new DigitValidator().validate(texto) && Integer.parseInt(texto) > 800 && Integer.parseInt(texto) < 1200);
	}

}
