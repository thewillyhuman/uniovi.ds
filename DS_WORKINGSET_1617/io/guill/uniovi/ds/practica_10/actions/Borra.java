package io.guill.uniovi.ds.practica_10.actions;

import io.guill.uniovi.ds.practica_10.contracts.Action;

public class Borra implements Action {
	
	public static final String name = "borra";
	private StringBuilder texto;
	
	public Borra(StringBuilder sb, String... params) {
		this.texto = sb;
	}

	@Override
	public StringBuilder execute() {
		int indexOfLastWord = texto.toString().trim().lastIndexOf(" ");
		if (indexOfLastWord == -1)
			texto = new StringBuilder("");
		else
			texto.setLength(indexOfLastWord + 1);
		return texto;
	}

}
