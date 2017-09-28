package io.guill.uniovi.ds.practica2;

public class Jmp implements IInstruction {
	
	private int address;
	
	public Jmp(Computer comp, int address) {
		this.address = address;
		operation(comp);
	}

	@Override
	public void operation(Computer comp) {
		comp.ip().set(address);
	}

}
