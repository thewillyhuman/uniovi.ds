package io.guill.uniovi.ds.practica_4.campos;

import io.guill.uniovi.ds.practica_4.validators.OptionsValidator;

public class CampoPredefinido extends Campo {

	private String[] valores;

	public CampoPredefinido(String etiqueta, String... valores) {
		super(etiqueta);
		this.valores = valores;
	}

	@Override
	protected boolean checkInput() {
		return new OptionsValidator(valores).validate(texto);
	}
}
