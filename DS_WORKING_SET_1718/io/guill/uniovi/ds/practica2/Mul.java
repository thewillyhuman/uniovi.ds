package io.guill.uniovi.ds.practica2;

public class Mul implements IInstruction {
	
	public Mul(Computer comp) {
		operation(comp);
		increaseIP(comp);
	}

	@Override
	public void operation(Computer comp) {
		comp.stack().push(comp.stack().pop() * comp.stack().pop());
	}

}
