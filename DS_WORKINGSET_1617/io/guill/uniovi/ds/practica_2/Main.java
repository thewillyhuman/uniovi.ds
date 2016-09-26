package io.guill.uniovi.ds.practica_2;

import java.io.*;
import java.util.*;

import io.guill.uniovi.ds.files.Files;

public class Main {

//	private static List<String[]> instrucciones = new ArrayList<String[]>();
//	private static Computer comp = new Computer();
//
	public static void main(String[] args) throws Exception {
//		BufferedReader fichero = new BufferedReader(new FileReader(Files.PATH_IN+"factorial.txt"));
//
//		String linea;
//		while ((linea = fichero.readLine()) != null)
//			loadInstruction(linea);
//		fichero.close();
//
//		executeProgram();
		Computer c = new Computer();
		c.run();
	}
//
//	private static void executeProgram() {
//		while (comp.getIP() < instrucciones.size()) {
//			String[] instruccion = instrucciones.get(comp.getIP());
//
//			if (instruccion[0].equals("push")) {
//				push(Integer.parseInt(instruccion[1]));
//				comp.increaseIP();
//			} else if (instruccion[0].equals("add")) {
//				push(pop() + pop());
//				comp.increaseIP();
//			} else if (instruccion[0].equals("sub")) {
//				int b = pop();
//				int a = pop();
//				push(a - b);
//				comp.increaseIP();
//			} else if (instruccion[0].equals("mul")) {
//				push(pop() * pop());
//				comp.increaseIP();
//			} else if (instruccion[0].equals("jmp")) {
//				comp.setIP(Integer.parseInt(instruccion[1]));
//			} else if (instruccion[0].equals("jmpg")) {
//				int b = pop();
//				int a = pop();
//				if (a > b)
//					comp.setIP(Integer.parseInt(instruccion[1]));
//				else
//					comp.increaseIP();
//			} else if (instruccion[0].equals("load")) {
//				int direccion = pop();
//				push(comp.getMemmoria(direccion));
//				comp.increaseIP();
//			} else if (instruccion[0].equals("store")) {
//				int valor = pop();
//				int direccion = pop();
//				comp.setMemoria(direccion, valor);
//				comp.increaseIP();
//			} else if (instruccion[0].equals("input")) {
//				System.out.println("Escriba un entero:");
//				push(leerValor());
//				comp.increaseIP();
//			} else if (instruccion[0].equals("output")) {
//				System.out.println(pop());
//				comp.increaseIP();
//			}
//		}
//	}
//	
//	private static void executeProgramV2() {
//		List<Instruction> instructions = new ArrayList<>();
//		instructions.add(new Add());
//		instructions.add(new Push());
//		instructions.add(new Mul());
//		instructions.add(new Jmp());
//		instructions.add(new Jmpg());
//		instructions.add(new Load());
//		instructions.add(new Store());
//		instructions.add(new Input());
//		instructions.add(new Output());
//		instructions.add(new Pop());
//		while (comp.getIP() < instrucciones.size()) {
//			String[] instruccion = instrucciones.get(comp.getIP());
//			System.out.println(instruccion.length);
//			for(Instruction ins : instructions) {
//				if (ins.isOperation(instruccion[0])) {
//					if(instruccion.length == 2) {
//						ins.operation(comp, instruccion[1]);
//					} else {
//						ins.operation(comp);
//					}
//				}
//			}
//			comp.increaseIP();
//		}
//	}
//
//	private static void loadInstruction(String linea) {
//		if (linea.trim().length() == 0)
//			return;
//
//		String[] palabras = linea.split(" ");
//		instrucciones.add(palabras);
//	}
//
//	private static void push(int valor) {
//		comp.setPila(comp.getSP(), valor);
//		comp.increaseSP();
//	}
//
//	private static int pop() {
//		comp.decreaseSP();
//		return comp.getPila(comp.getSP());
//	}
//
//	@SuppressWarnings("resource")
//	private static int leerValor() {
//		return new Scanner(System.in).nextInt();
//	}
}
