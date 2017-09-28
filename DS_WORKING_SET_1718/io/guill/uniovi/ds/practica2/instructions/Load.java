package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Load implements IInstruction {
	
	public Load(Computer comp) {
		operation(comp);
		increaseIP(comp);
	}

	@Override
	public void operation(Computer comp) {
		int address = comp.stack().pop();
		comp.stack().push(comp.memory().valueAt(address));
	}

}
