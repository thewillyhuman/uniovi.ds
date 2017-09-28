package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Push implements IInstruction {
	
	private int value;
	
	public Push(Computer comp, int value) {
		this.value = value;
		operation(comp);
		increaseIP(comp);
	}

	@Override
	public void operation(Computer comp) {
		comp.stack().push(value);
		comp.sp().increase();
	}

}
