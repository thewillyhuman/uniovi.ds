package io.guill.uniovi.ds.practica2;

public interface IInstruction {
	
	/**
	 * Main operation that each instruction should perform.
	 * 
	 * @param comp is a socket that shares the hole computer system.
	 */
	 void operation(Computer comp);
	 
	 /**
	  * Increased the IP of the given computer in one unit.
	  * @param comp is the computer where we want to increase the IP.
	  */
	 default void increaseIP(Computer comp) {
		 comp.ip().increase();
	 }

}
