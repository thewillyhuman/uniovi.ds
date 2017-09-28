package io.guill.uniovi.ds.practica2;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	private List<String[]> instructions = null;
	
	public Program() {
		instructions = new ArrayList<String[]>();
	}
	
	/**
	 * 
	 * @return
	 */
	public List<String[]> self() {
		return this.instructions;
	}
	
	/**
	 * 
	 * @param linea
	 */
	public void loadInstruction(String linea) {
		if (linea.trim().length() == 0)
			return;

		String[] palabras = linea.split(" ");
		instructions.add(palabras);
	}

}
