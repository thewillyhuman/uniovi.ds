package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.validators.TextValidator;

public class CampoTexto extends Campo {


	public CampoTexto(String etiqueta) {
		super(etiqueta);
	}

	/**
	 * @return true if the text is plain text. False otherwise.
	 */
	@Override
	public boolean checkInput() {
		return new TextValidator().validate(texto);
	}
}
