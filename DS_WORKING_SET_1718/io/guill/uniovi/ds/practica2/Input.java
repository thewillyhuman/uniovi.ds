package io.guill.uniovi.ds.practica2;

public class Input implements IInstruction {
	
	public Input(Computer comp) {
		operation(comp);
		increaseIP(comp);
	}

	@Override
	public void operation(Computer comp) {
		System.out.println("Escriba un entero:");
		comp.stack().push(new IODevice(comp).terminal().nextInt());
	}

}
