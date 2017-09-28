package io.guill.uniovi.ds.practica2.components;

import java.util.Stack;

public class CompStack extends Stack<Integer> {
	
	private static final long serialVersionUID = 1L;
	public static final int MAX_CAPACITY = 32;
	
	/**
	 * 
	 */
	public Integer pop() {
		return super.pop();
	}
	
	/**
	 * 
	 * @param element
	 */
	public void push(int element) {
		if(super.size() >= MAX_CAPACITY) {
			throw new StackOverflowError();
		}
		super.push(element);
	}

}
