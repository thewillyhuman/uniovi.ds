package io.guill.uniovi.ds.practica2;

import java.util.List;

import io.guill.uniovi.ds.practica2.instructions.Add;
import io.guill.uniovi.ds.practica2.instructions.Input;
import io.guill.uniovi.ds.practica2.instructions.Jmp;
import io.guill.uniovi.ds.practica2.instructions.Jmpg;
import io.guill.uniovi.ds.practica2.instructions.Load;
import io.guill.uniovi.ds.practica2.instructions.Mul;
import io.guill.uniovi.ds.practica2.instructions.Output;
import io.guill.uniovi.ds.practica2.instructions.Push;
import io.guill.uniovi.ds.practica2.instructions.Store;
import io.guill.uniovi.ds.practica2.instructions.Sub;

public class ExecuteProgram {
	
	public ExecuteProgram(Computer comp, Program program) {
		run(comp, program.self());
	}

	/**
	 * 
	 * @param comp
	 * @param instrucciones
	 */
	private void run(Computer comp, List<String[]> instrucciones) {
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
