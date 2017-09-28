package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;

public class PushIPInc extends Push {
	
	public PushIPInc(int value) {
		super(value);
	}

	@Override
	public void operation(Computer comp) {
		comp.stack().push(super.value);
		new IncreaseIP().operation(comp);
	}

}
