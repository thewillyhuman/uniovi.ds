package io.guill.uniovi.ds.practica2.components;

import java.util.Stack;

public class CompStack extends Stack<Integer> {
	
	private static final long serialVersionUID = 1L;
	public static final int MAX_CAPACITY = 32;
	
	@Override
	public Integer pop() {
		return super.pop();
	}
	
	/**
	 * Pushes an element on to the top of this stack.
	 * 
	 * @param element to push on to the top of the stack.
	 */
	public void push(int element) {
		/*if(super.size() >= MAX_CAPACITY) {
			throw new StackOverflowError();
		}*/
		super.push(element);
	}

}
