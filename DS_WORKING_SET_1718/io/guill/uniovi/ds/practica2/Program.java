package io.guill.uniovi.ds.practica2;

import java.util.ArrayList;
import java.util.List;

public class Program {

	private List<String[]> instructions = null;

	public Program() {
		instructions = new ArrayList<String[]>();
	}

	/**
	 * Gives the original object of a program that is the set of instructions as
	 * a list of arrays of Strings.
	 * 
	 * @return a list of arrays of Strings
	 */
	public List<String[]> self() {
		return this.instructions;
	}

	/**
	 * Loads one instruction in the program. One instruction is given as a line
	 * of code.
	 * 
	 * @param line is the string line we want to load as an instruction.
	 */
	public void loadInstruction(String line) {
		if (line.trim().length() == 0)
			return;

		String[] palabras = line.split(" ");
		instructions.add(palabras);
	}

}
