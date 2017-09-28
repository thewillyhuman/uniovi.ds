package io.guill.uniovi.ds.practica2;

import java.util.List;

public class ExecuteProgram {
	
	public ExecuteProgram(Computer comp, List<String[]> instrucciones) {
		ejecutaPrograma(comp, instrucciones);
	}

	/**
	 * 
	 * @param comp
	 * @param instrucciones
	 */
	private void ejecutaPrograma(Computer comp, List<String[]> instrucciones) {
		while (comp.ip().self() < instrucciones.size()) {
			String[] instruccion = instrucciones.get(comp.ip().self());
			
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
