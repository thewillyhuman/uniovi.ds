package io.guill.uniovi.ds.practica2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Computer {

	private static List<String[]> instrucciones = new ArrayList<String[]>();
	
	private CompIP ip = null; 
	private CompMemory memory = null;
	private CompStack stack = null;
	private CompSP sp = null;
	
	public Computer() {
		ip = new CompIP();
		memory = new CompMemory();
		stack = new CompStack();
		sp = new CompSP();
		
		try {
			new IODevice(this).loadProgram("io/guill/uniovi/ds/practica2/programa.txt");
		} catch (IOException e) {
			System.err.println("Error while loading the program.");
			e.printStackTrace();
		}
		
		new ExecuteProgram(this, instrucciones);
	}
	
	void loadInstruction(String linea) {
		if (linea.trim().length() == 0)
			return;

		String[] palabras = linea.split(" ");
		instrucciones.add(palabras);
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
	
}
