package io.guill.uniovi.ds.practica_2;

public class Computer {
	
	private static int ip = 0;

	private static int[] memoria = new int[1024];

	private static int[] pila = new int[32];
	private static int sp = 0;
	
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

}
