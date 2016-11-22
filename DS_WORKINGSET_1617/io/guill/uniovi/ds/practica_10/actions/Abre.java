package io.guill.uniovi.ds.practica_10.actions;

import io.guill.uniovi.ds.practica_10.Main;
import io.guill.uniovi.ds.practica_10.contracts.Action;

import java.io.IOException;

public class Abre implements Action {
	public static final String name = "abre";
	private StringBuilder texto;
	private String filename;
	
	public Abre(StringBuilder sb, String... params) {
		texto = sb;
		this.filename = params[0];
	}
	
	/**
	 * Executes the instruction
	 * @param filename the file to open
	 * @return an string builder with the file.
	 */
	@Override
	public StringBuilder execute() {
		try {
			texto = Main.readFile(filename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return texto;
	}

}
