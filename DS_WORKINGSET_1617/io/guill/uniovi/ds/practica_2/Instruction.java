package io.guill.uniovi.ds.practica_2;

public interface Instruction {
	
	/**
	 * Main operation that each instruction should perform.
	 * 
	 * @param comp is a socket that shares the hole computer system.
	 */
	public void operation(Computer comp);
	//public void operation(Computer comp, String ins);
	
	/**
	 * Checks if the current operation is the one provided by name.
	 * 
	 * @param name to compare the operations name.
	 * @return true if is the operation, false otherwise.
	 */
	public boolean isOperation(String name);
}
