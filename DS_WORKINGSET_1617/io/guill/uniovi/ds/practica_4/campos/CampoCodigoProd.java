package io.guill.uniovi.ds.practica_4.campos;

public class CampoCodigoProd extends Campo {
	
	public CampoCodigoProd(String etiqueta) {
		super(etiqueta);
	}

	@Override
	protected boolean checkInput() {
		if(texto.length()==4)
			return true;
		return false;
	}

}
