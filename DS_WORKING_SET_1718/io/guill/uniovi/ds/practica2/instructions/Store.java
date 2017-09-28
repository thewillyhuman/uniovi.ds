package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Store implements IInstruction {

	@Override
	public void operation(Computer comp) {
		int value = new Pop().value(comp);
		int address = new Pop().value(comp);
		comp.memory().set(address, value);
		new IncreaseIP().operation(comp);
	}

}
