package io.guill.uniovi.ds.practica_4.campos;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;
import io.guill.uniovi.ds.practica_4.validators.OptionsValidator;

public class CampoUbicacion extends Campo {
	
	private String[] valores;

	public CampoUbicacion(String etiqueta, String... valores) {
		super(etiqueta);
		this.valores = valores;
	}

	@Override
	protected boolean checkInput() {
		if(new DigitValidator().validate(texto) && texto.length() == CampoCodigoPostal.LENGTH)
			return true;
		return new OptionsValidator(valores).validate(texto);
	}

}
