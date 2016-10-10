package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.validators.OptionsValidator;

public class CampoPredefinido extends Campo {

	private String[] valores;

	public CampoPredefinido(String etiqueta, String... valores) {
		super(etiqueta);
		this.valores = valores;
	}

	/**
	 * @return true if the text matches with some of the predefined inputs. False otherwise.
	 */
	@Override
	public boolean checkInput() {
		return new OptionsValidator(valores).validate(texto);
	}
}
