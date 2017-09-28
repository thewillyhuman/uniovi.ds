package io.guill.uniovi.ds.practica2.components;

public class CompMemory {

	public static final int DEFAULT_CAPACITY = 1024;
	private int[] space = new int[DEFAULT_CAPACITY];
	
	/**
	 * 
	 * @param address in memory where to place the element.
	 * @param value to place in the address provided.
	 */
	public void set(int address, int value) {
		if(0 > address || address> DEFAULT_CAPACITY)
			throw new IndexOutOfBoundsException();
		this.space[address] = value;
	}
	
	/**
	 * 
	 * @param address
	 * @return
	 */
	public int valueAt(int address) {
		return this.space[address];
	}
}
