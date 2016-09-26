package io.guill.uniovi.ds.practica_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import io.guill.uniovi.ds.files.Files;

/**
 * Represents a very basic computer system.
 * 
 * @version 1.0
 * @author Guillermo Facundo Colunga
 * @repo https://github.com/ZenMaster91/uniovi.ds
 */
public class Computer {

	private static List<String[]> instrucciones = new ArrayList<String[]>();

	private static int ip = 0;

	private static int[] memoria = new int[1024];
	private static int[] pila = new int[32];

	private static int sp = 0;

	/**
	 * Loads a given line of "code" as an instruction in the system.
	 * 
	 * @param linea represents the instruction as an String.
	 */
	private static void loadInstruction(String linea) {
		if (linea.trim().length() == 0)
			return;

		String[] palabras = linea.split(" ");
		instrucciones.add(palabras);
	}

	/**
	 * Main method to run the computer in the console.
	 * 
	 * @param args nothing expected as arguments.
	 * @throws Exception if there're any error while loading the files.
	 */
	public static void main(String[] args) throws Exception {
		Computer c = new Computer("factorial.txt");
		c.run();
	}

	/**
	 * Main constructor of a computer. Will load the file with the instructions in the system.
	 * 
	 * @throws Exception if there is any problem while loading the file.
	 */
	public Computer(String filename) throws Exception {
		BufferedReader fichero = new BufferedReader(new FileReader(Files.PATH_IN + filename));
		String linea;
		while ((linea = fichero.readLine()) != null)
			loadInstruction(linea);
		fichero.close();
	}

	/**
	 * Decreases the value of the SP in one unit.
	 */
	public void decreaseSP() {
		sp--;
	}

	/**
	 * Gets the current IP of the system.
	 * 
	 * @return the IP of the computer.
	 */
	public int getIP() {
		return ip;
	}

	/**
	 * Gets the array corresponding to the memory.
	 * 
	 * @return the corresponding integer array to the memory.
	 */
	public int[] getMemoria() {
		return memoria;
	}

	/**
	 * Gets the value allocated in a certain memory position.
	 * 
	 * @param pos is the position in the memory
	 * @return the value allocated in that given position.
	 */
	public int getMemoria(int pos) {
		return memoria[pos];
	}
	
	/**
	 * Gets the integer array corresponding to the stack.
	 * 
	 * @return the hole integer stack array.
	 */
	public int[] getPila() {
		return pila;
	}
	
	/**
	 * Gets the value allocated in certain position of the stack.
	 * 
	 * @param pos is the position of the element in the stack.
	 * @return the integer element allocated in that position of the stack.
	 */
	public int getPila(int pos) {
		return pila[pos];
	}

	/**
	 * Gets the SP of the computer.
	 * 
	 * @return the IP of the computer.
	 */
	public int getSP() {
		return sp;
	}

	/**
	 * Increases in one unit the ip of the system.
	 */
	public void increaseIP() {
		ip++;
	}
	
	/**
	 * Increases the value of the SP in one unit.
	 */
	public void increaseSP() {
		sp++;
	}

	/**
	 * Runs all the loaded instructions in the system.
	 */
	private void run() {
		while (ip < instrucciones.size()) {
			String[] instruccion = instrucciones.get(ip);
			
			System.err.println("START INST: " + instruccion[0] + "\tIP:" + ip + "\tSP:" + sp);
	
			if (instruccion[0].equals("push")) {
				new Push(Integer.parseInt(instruccion[1])).operation(this);
				this.increaseIP();
			} else if (instruccion[0].equals("add")) {
				new Add().operation(this);
			} else if (instruccion[0].equals("sub")) {
				new Sub().operation(this);
			} else if (instruccion[0].equals("mul")) {
				new Mul().operation(this);
			} else if (instruccion[0].equals("jmp")) {
				new Jmp(instruccion[1]).operation(this);
			} else if (instruccion[0].equals("jmpg")) {
				new Jmpg(instruccion[1]).operation(this);
			} else if (instruccion[0].equals("load")) {
				new Load().operation(this);
			} else if (instruccion[0].equals("store")) {
				new Store().operation(this);
			} else if (instruccion[0].equals("input")) {
				new Input().operation(this);
			} else if (instruccion[0].equals("output")) {
				new Output().operation(this);
			}
			
			System.err.println("END OF INST: " + instruccion[0] + "\tIP:" + ip + "\tSP:" + sp + "\n");
		}
	}

	/**
	 * Sets the IP to a specific value.
	 * 
	 * @param value will be the new value of the IP.
	 */
	public void setIP(int value) {
		ip = value;
	}
	
	/**
	 * Sets a given position in the memory to a given value.
	 * 
	 * @param pos to place the given value.
	 * @param value to be allocated in the given memory position.
	 */
	public void setMemoria(int pos, int value) {
		memoria[pos] = value;
	}
	
	/**
	 * Sets in a given position of the stack a given element.
	 * 
	 * @param pos is the position for the new value.
	 * @param value to set in the given position.
	 */
	public void setPila(int pos, int value) {
		pila[pos] = value;
	}
}
