package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Push implements IInstruction {
	
	int value;
	
	public Push(int value) {
		this.value = value;
	}

	@Override
	public void operation(Computer comp) {
		comp.stack().push(value);
	}

}
