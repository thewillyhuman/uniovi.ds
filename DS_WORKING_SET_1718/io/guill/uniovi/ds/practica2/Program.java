package io.guill.uniovi.ds.practica2;

import java.util.ArrayList;
import java.util.List;
import io.guill.uniovi.ds.practica2.instructions.*;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Program {

	private List<IInstruction> instructions = null;

	public Program() {
		instructions = new ArrayList<IInstruction>();
	}

	/**
	 * Gives the original object of a program that is the set of instructions as
	 * a list of arrays of Strings.
	 * 
	 * @return a list of arrays of Strings
	 */
	public List<IInstruction> self() {
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

		String[] instruccion = line.split(" ");
		if (instruccion[0].equals("push")) {
			instructions.add(new PushIPInc(Integer.parseInt(instruccion[1])));
			//instructions.add(new IncreaseIP());
		} else if (instruccion[0].equals("add")) {
			instructions.add(new Add());
		} else if (instruccion[0].equals("sub")) {
			instructions.add(new Sub());
		} else if (instruccion[0].equals("mul")) {
			instructions.add(new Mul());
		} else if (instruccion[0].equals("jmp")) {
			instructions.add(new Jmp(Integer.parseInt(instruccion[1])));
		} else if (instruccion[0].equals("jmpg")) {
			instructions.add(new Jmpg(Integer.parseInt(instruccion[1])));
		} else if (instruccion[0].equals("load")) {
			instructions.add(new Load());
		} else if (instruccion[0].equals("store")) {
			instructions.add(new Store());
		} else if (instruccion[0].equals("input")) {
			instructions.add(new Input());
		} else if (instruccion[0].equals("output")) {
			instructions.add(new Output());
		}
		String aux = "";
		if(instruccion.length>1)
			aux = instruccion[1];
		System.out.print(instruccion[0] + " " +  aux);
		System.out.println(/*" - " + instructions.get(instructions.size()-1).getClass().getCanonicalName()*/);
	}

}
