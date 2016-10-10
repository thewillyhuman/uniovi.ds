package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.validators.LengthValidator;

public class CampoCodigoProd extends Campo {
	
	public final static int COD_PROD_LENGTH = 4;
	
	public CampoCodigoProd(String etiqueta) {
		super(etiqueta);
	}

	/**
	 * @return true if the length of the text is 4. False otherwise.
	 */
	@Override
	public boolean checkInput() {
		return new LengthValidator(COD_PROD_LENGTH).validate(texto);
	}

}
