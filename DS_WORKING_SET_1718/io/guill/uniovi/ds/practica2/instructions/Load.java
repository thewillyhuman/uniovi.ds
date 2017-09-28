package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Load implements IInstruction {

	@Override
	public void operation(Computer comp) {
		int address = new Pop().value(comp);
		new Push(comp.memory().valueAt(address)).operation(comp);
		new IncreaseIP().operation(comp);
	}

}
