package io.guill.uniovi.ds.practica_4.campos;

import io.guill.uniovi.ds.practica_4.validators.DigitValidator;
import io.guill.uniovi.ds.practica_4.validators.TextValidator;

public class CampoCodigoPromocion extends Campo {
	
	public final static int COD_PROM_SIZE = 3;

	public CampoCodigoPromocion(String etiqueta) {
		super(etiqueta);
	}

	@Override
	protected boolean checkInput() {
		if(new TextValidator().validate(texto))
			return true;
		else if(new DigitValidator().validate(texto) && texto.length() == COD_PROM_SIZE)
			return true;
		
		return false;
	}

}
