package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Pop implements IInstruction {
	
	private int value;

	/**
	 * Gives the value of the pop operation.
	 * 
	 * @return the value of the pop operation.
	 */
	public int value(Computer comp) {
		operation(comp);
		return this.value;
	}

	@Override
	public void operation(Computer comp) {
		this.value = comp.stack().pop();
	}

}
