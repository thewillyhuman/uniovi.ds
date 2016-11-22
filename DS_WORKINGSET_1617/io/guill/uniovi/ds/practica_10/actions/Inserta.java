package io.guill.uniovi.ds.practica_10.actions;

import io.guill.uniovi.ds.practica_10.contracts.Action;

public class Inserta implements Action {
	public static final String name = "inserta";
	private StringBuilder sb;
	private String insertion;
	
	public Inserta(StringBuilder sb, String... params) {
		this.sb = sb;
		this.insertion=(String) params[0];
	}

	@Override
	public StringBuilder execute() {
		sb.append(insertion);
		return sb;
	}

}
