package io.guill.uniovi.ds.practica2;

import java.util.List;
import io.guill.uniovi.ds.practica2.instructions.*;

public class ExecuteProgram {
	
	public ExecuteProgram(Computer comp, Program program) {
		run(comp, program.self());
	}

	/**
	 * Runs a the given program in the given computer.
	 * 
	 * @param comp is the computer where the program will run.
	 * @param instructions are the set of instructions to run.
	 */
	private void run(Computer comp, List<String[]> instructions) {
		while (comp.ip().self() < instructions.size()) {
			String[] instruccion = instructions.get(comp.ip().self());
			
			if (instruccion[0].equals("push")) {
				new Push(comp, Integer.parseInt(instruccion[1]));
			} else if (instruccion[0].equals("add")) {
				new Add(comp);
			} else if (instruccion[0].equals("sub")) {
				new Sub(comp);
			} else if (instruccion[0].equals("mul")) {
				new Mul(comp);
			} else if (instruccion[0].equals("jmp")) {
				new Jmp(comp, Integer.parseInt(instruccion[1]));
			} else if (instruccion[0].equals("jmpg")) {
				new Jmpg(comp, Integer.parseInt(instruccion[1]));
			} else if (instruccion[0].equals("load")) {
				new Load(comp);
			} else if (instruccion[0].equals("store")) {
				new Store(comp);
			} else if (instruccion[0].equals("input")) {
				new Input(comp);
			} else if (instruccion[0].equals("output")) {
				new Output(comp);
			}
		}
	}

}
