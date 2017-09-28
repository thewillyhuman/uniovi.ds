package io.guill.uniovi.ds.practica2.components;

public class CompIP {

	private int ip = 0;
	
	/**
	 * Increases the IP in one unit.
	 */
	public void increase() {
		this.ip++;
	}
	
	/**
	 * Decreases the IP in one unit.
	 */
	public void decrease() {
		this.ip++;
	}
	
	/**
	 * @param value is the new value for the IP.
	 */
	public void set(int value) {
		this.ip = value;
	}
	
	/**
	 * @return the current IP value.
	 */
	public int self() {
		return this.ip;
	}
}
