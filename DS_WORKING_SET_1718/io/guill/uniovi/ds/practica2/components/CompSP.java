package io.guill.uniovi.ds.practica2.components;

public class CompSP {

	private int sp = 0;
	
	/**
	 * Increases the IP in one unit.
	 */
	public void increase() {
		this.sp++;
	}
	
	/**
	 * Decreases the IP in one unit.
	 */
	public void decrease() {
		this.sp++;
	}
	
	/**
	 * @return the current IP value.
	 */
	public int self() {
		return this.sp;
	}
}
