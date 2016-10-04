package io.guill.uniovi.ds.practica_4.fields;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;
import io.guill.uniovi.ds.practica_4.validators.LengthValidator;
import io.guill.uniovi.ds.practica_4.validators.TextValidator;

public class CampoCodigoPromocion extends Campo {

	public final static int COD_PROM_SIZE = 3;

	public CampoCodigoPromocion(String etiqueta) {
		super(etiqueta);
	}

	/**
	 * @return true if the text is plain text or 3 digit number. False
	 *         otherwise.
	 */
	@Override
	public boolean checkInput() {
		return new TextValidator().validate(texto)
				|| (new DigitValidator().validate(texto) && new LengthValidator(COD_PROM_SIZE).validate(texto));
	}

}
