package io.guill.uniovi.ds.practica2;

public class ExecuteProgram {
	
	public ExecuteProgram(Computer comp, Program program) {
		run(comp, program);
	}

	/**
	 * Runs a the given program in the given computer.
	 * 
	 * @param comp is the computer where the program will run.
	 * @param instructions are the set of instructions to run.
	 */
	private void run(Computer comp, Program program) {
		while(comp.ip().self() < program.self().size()) {
			program.self().get(comp.ip().self()).operation(comp);
		}
	}

}
