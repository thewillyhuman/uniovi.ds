package io.guill.uniovi.ds.practica_4.campos;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;

public class CampoEdad extends Campo {
	
	public final static int LEGAL_AGE = 18;

	public CampoEdad(String etiqueta) {
		super(etiqueta);
	}

	@Override
	protected boolean checkInput() {
		return(new DigitValidator().validate(texto) && Integer.parseInt(texto) >= LEGAL_AGE);
	}

}
