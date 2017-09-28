package io.guill.uniovi.ds.practica2.components;

public class CompMemory {

	public static final int DEFAULT_CAPACITY = 1024;
	private int[] space = new int[DEFAULT_CAPACITY];
	
	/**
	 * Sets a value in the given address of the memory.
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
	 * Gives the value placed in the address given.
	 * 
	 * @param address of the element we want to get.
	 * @return the element placed in the address provided.
	 */
	public int valueAt(int address) {
		return this.space[address];
	}
}
