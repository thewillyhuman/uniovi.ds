package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Pop implements IInstruction {
	
	private int value;
	
	public Pop(Computer comp) {
		operation(comp);
		increaseIP(comp);
	}
	
	public int value() {
		return this.value;
	}

	@Override
	public void operation(Computer comp) {
		this.value = comp.stack().pop();
		comp.sp().decrease();
	}

}
