package io.guill.uniovi.ds.practica_10.actions;

import java.util.regex.Pattern;

import io.guill.uniovi.ds.practica_10.contracts.Action;

public class Reemplaza implements Action {
	public static final String name = "reemplaza";
	private StringBuilder texto;
	private String toReplace, replacement;
	
	public Reemplaza(StringBuilder sb, String... params) {
		this.texto = sb;
		this.toReplace = params[0];
		this.replacement = params[1];
	}

	@Override
	public StringBuilder execute() {
		texto = new StringBuilder(texto.toString().replaceAll(Pattern.quote(toReplace), replacement));
		return texto;
	}

}
