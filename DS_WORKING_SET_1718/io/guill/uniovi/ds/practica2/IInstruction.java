package io.guill.uniovi.ds.practica2;

public interface IInstruction {
	
	/**
	 * Main operation that each instruction should perform.
	 * 
	 * @param comp is a socket that shares the hole computer system.
	 */
	 void operation(Computer comp);
	 
	 default void increaseIP(Computer comp) {
		 comp.ip().increase();
	 }

}
