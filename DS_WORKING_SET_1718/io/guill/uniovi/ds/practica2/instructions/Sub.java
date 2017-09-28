package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Sub implements IInstruction {

	@Override
	public void operation(Computer comp) {
		int b = new Pop().value(comp);
		int a = new Pop().value(comp);
		new Push(a - b).operation(comp);
		new IncreaseIP().operation(comp);
	}

}
