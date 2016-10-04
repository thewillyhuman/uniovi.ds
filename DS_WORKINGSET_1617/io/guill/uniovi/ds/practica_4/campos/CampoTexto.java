package io.guill.uniovi.ds.practica_4.campos;

import io.guill.uniovi.ds.practica_4.validators.TextValidator;

public class CampoTexto extends Campo {


	public CampoTexto(String etiqueta) {
		super(etiqueta);
	}

	@Override
	protected boolean checkInput() {
		return new TextValidator().validate(texto);
	}
}
