package io.guill.uniovi.ds.practica_4.campos;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;

public class CampoCodigoPostal extends Campo {
	
	public final static int LENGTH = 5;

	public CampoCodigoPostal(String etiqueta) {
		super(etiqueta);
	}

	@Override
	protected boolean checkInput() {
		if(texto.length() != LENGTH)
			return false;
		return new DigitValidator().validate(texto);
	}

}
