package io.guill.uniovi.ds.practica2;

import java.io.IOException;

import io.guill.uniovi.ds.practica2.components.*;

public class Computer {
	
	private CompIP ip = null; 
	private CompMemory memory = null;
	private CompStack stack = null;
	private CompSP sp = null;
	private Program program = null;
	
	public Computer() {
		this.ip = new CompIP();
		this.memory = new CompMemory();
		this.stack = new CompStack();
		this.sp = new CompSP();
		this.program = new Program();
		
		try {
			new IOHelper(this).loadProgram("io/guill/uniovi/ds/practica2/programa.txt");
		} catch (IOException e) {
			System.err.println("Error while loading the program.");
			e.printStackTrace();
		}
		
		new ExecuteProgram(this, program);
	}
	
	public CompIP ip() {
		return this.ip;
	}
	
	public CompMemory memory() {
		return this.memory;
	}
	
	public CompStack stack() {
		return this.stack;
	}
	
	public CompSP sp() {
		return this.sp;
	}
	
	public Program program() {
		return this.program;
	}
	
}
