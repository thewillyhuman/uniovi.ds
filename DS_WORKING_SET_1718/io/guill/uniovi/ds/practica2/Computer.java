package io.guill.uniovi.ds.practica2;

import java.io.IOException;
import io.guill.uniovi.ds.practica2.components.*;

public class Computer {
	
	private CompIP ip = null; 
	private CompMemory memory = null;
	private CompStack stack = null;
	private Program program = null;
	
	public Computer() {
		this.ip = new CompIP();
		this.memory = new CompMemory();
		this.stack = new CompStack();
		this.program = new Program();
		
		try {
			new IOHelper(this).loadProgram("io/guill/uniovi/ds/practica2/programa.txt");
		} catch (IOException e) {
			System.err.println("Error while loading the program.");
			e.printStackTrace();
		}
		System.out.println(program.self().size());
		new ExecuteProgram(this, program);
	}
	
	/**
	 * Gives the IP.
	 * 
	 * @return the IP component.
	 */
	public CompIP ip() {
		return this.ip;
	}
	
	/**
	 * Gives the memory.
	 * 
	 * @return the memory component.
	 */
	public CompMemory memory() {
		return this.memory;
	}
	
	/**
	 * Gives access to the stack.
	 * 
	 * @return the stack component.
	 */
	public CompStack stack() {
		return this.stack;
	}
	
	/**
	 * Gives the program.
	 * 
	 * @return the program.
	 */
	public Program program() {
		return this.program;
	}
	
}
