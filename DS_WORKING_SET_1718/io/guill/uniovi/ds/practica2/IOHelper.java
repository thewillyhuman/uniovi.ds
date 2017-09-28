package io.guill.uniovi.ds.practica2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOHelper {

	private Computer comp;
	
	public IOHelper(Computer comp) {
		this.comp = comp;
	}
	
	/**
	 * Given a file of instructions will load its content on to the system.
	 * 
	 * @throws IOException if there's any problem while loading the file.
	 */
	public void loadProgram(String file) throws IOException {
		BufferedReader fichero = new BufferedReader(new FileReader(file));

		String linea;
		while ((linea = fichero.readLine()) != null)
			comp.program().loadInstruction(linea);
		fichero.close();
	}
	
	/**
	 * Gives access to the terminal object.
	 * 
	 * @return the terminal screen waiting for an input.
	 */
	public Scanner terminal() {
		return new Scanner(System.in);
	}
}
