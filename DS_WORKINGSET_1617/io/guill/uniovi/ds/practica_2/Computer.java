package io.guill.uniovi.ds.practica_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import io.guill.uniovi.ds.files.Files;

public class Computer {

	private static int ip = 0;

	private static int[] memoria = new int[1024];

	private static int[] pila = new int[32];
	private static int sp = 0;

	private static List<String[]> instrucciones = new ArrayList<String[]>();

	public Computer() throws Exception {
		BufferedReader fichero = new BufferedReader(new FileReader(Files.PATH_IN + "factorial.txt"));

		String linea;
		while ((linea = fichero.readLine()) != null)
			loadInstruction(linea);
		fichero.close();
	}

	public int getIP() {
		return ip;
	}

	public void increaseIP() {
		ip++;
	}

	public void setIP(int value) {
		ip = value;
	}

	public int[] getMemmoria() {
		return memoria;
	}

	public int getMemmoria(int pos) {
		return memoria[pos];
	}

	public void setMemoria(int pos, int value) {
		memoria[pos] = value;
	}

	public int getSP() {
		return sp;
	}

	public void increaseSP() {
		sp++;
	}

	public void decreaseSP() {
		sp--;
	}

	public int[] getPila() {
		return pila;
	}

	public int getPila(int pos) {
		return pila[pos];
	}

	public void setPila(int pos, int value) {
		pila[pos] = value;
	}

	/**
	 * Executes one given instruction.
	 * 
	 * @param ins
	 *            instruction to execute
	 */
	public void executeInstruction(Instruction ins) {
		ins.operation(this);
		this.increaseIP();
	}

	private static void loadInstruction(String linea) {
		if (linea.trim().length() == 0)
			return;

		String[] palabras = linea.split(" ");
		instrucciones.add(palabras);
	}
	
	public void run() {
		while (this.getIP() < instrucciones.size()) {
			String[] instruccion = instrucciones.get(this.getIP());

			if (instruccion[0].equals("push")) {
				executeInstruction(new Push(Integer.parseInt(instruccion[1])));
				this.increaseIP();
			} else if (instruccion[0].equals("add")) {
				executeInstruction(new Push(new Pop().getValue(this) + new Pop().getValue(this)));
				this.increaseIP();
			} else if (instruccion[0].equals("sub")) {
				int b = new Pop().getValue(this);
				int a = new Pop().getValue(this);
				new Push(a - b);
				this.increaseIP();
			} else if (instruccion[0].equals("mul")) {
				new Push(new Pop().getValue(this) * new Pop().getValue(this));
				this.increaseIP();
			} else if (instruccion[0].equals("jmp")) {
				this.setIP(Integer.parseInt(instruccion[1]));
			} else if (instruccion[0].equals("jmpg")) {
				int b = new Pop().getValue(this);
				int a = new Pop().getValue(this);
				if (a > b)
					this.setIP(Integer.parseInt(instruccion[1]));
				else
					this.increaseIP();
			} else if (instruccion[0].equals("load")) {
				int direccion = new Pop().getValue(this);
				new Push(this.getMemmoria(direccion));
				this.increaseIP();
			} else if (instruccion[0].equals("store")) {
				int valor = new Pop().getValue(this);
				int direccion = new Pop().getValue(this);
				this.setMemoria(direccion, valor);
				this.increaseIP();
			} else if (instruccion[0].equals("input")) {
				System.out.println("Escriba un entero:");
				new Push(leerValor());
				this.increaseIP();
			} else if (instruccion[0].equals("output")) {
				System.out.println(new Pop().getValue(this));
				this.increaseIP();
			}
		}
	}
	
	@SuppressWarnings("resource")
	private static int leerValor() {
		return new Scanner(System.in).nextInt();
	}

}
