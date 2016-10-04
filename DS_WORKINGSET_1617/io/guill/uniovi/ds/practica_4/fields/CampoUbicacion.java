package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;
import io.guill.uniovi.ds.practica_4.validators.LengthValidator;
import io.guill.uniovi.ds.practica_4.validators.OptionsValidator;

public class CampoUbicacion extends Campo {
	
	private String[] valores;

	public CampoUbicacion(String etiqueta, String... valores) {
		super(etiqueta);
		this.valores = valores;
	}

	/**
	 * @return return true if the text it is a postal code or if the text is one of the predefined options. False otherwise.
	 */
	@Override
	public boolean checkInput() {
		return (new DigitValidator().validate(texto) && new LengthValidator(CampoCodigoPostal.LENGTH).validate(texto)) || new OptionsValidator(valores).validate(texto);
	}

}
