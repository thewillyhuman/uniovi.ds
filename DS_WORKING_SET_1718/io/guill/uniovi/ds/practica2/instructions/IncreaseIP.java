package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class IncreaseIP implements IInstruction {

	@Override
	public void operation(Computer comp) {
		comp.ip().increase();
	}

}
