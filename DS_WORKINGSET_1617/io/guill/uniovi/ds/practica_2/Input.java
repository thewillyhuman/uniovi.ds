package io.guill.uniovi.ds.practica_2;

import java.util.Scanner;

public class Input implements Instruction {

	@Override
	public void operation(Computer comp) {
		System.out.println("Escriba un entero:");
		new Push(leerValor());
	}
	
	@SuppressWarnings("resource")
	private static int leerValor() {
		return new Scanner(System.in).nextInt();
	}

	@Override
	public boolean isOperation(String name) {
		if(name.equals("input"))
			return true;
		return false;
	}

	@Override
	public void operation(Computer comp, String ins) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void increaseIP(Computer comp) {
		comp.increaseIP();
	}

}
