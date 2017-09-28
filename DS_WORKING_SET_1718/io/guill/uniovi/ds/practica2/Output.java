package io.guill.uniovi.ds.practica2;

public class Output implements IInstruction {
	
	public Output(Computer comp) {
		operation(comp);
		increaseIP(comp);
	}

	@Override
	public void operation(Computer comp) {
		System.out.println(comp.stack().pop());
	}

}
