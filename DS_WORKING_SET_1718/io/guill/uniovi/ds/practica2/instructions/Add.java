package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Add implements IInstruction {

	@Override
	public void operation(Computer comp) {
		new Push((new Pop().value(comp) + new Pop().value(comp))).operation(comp);
		new IncreaseIP().operation(comp);
	}

}
