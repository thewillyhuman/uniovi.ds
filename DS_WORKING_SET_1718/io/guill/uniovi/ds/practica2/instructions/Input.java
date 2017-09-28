package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;
import io.guill.uniovi.ds.practica2.IOHelper;

public class Input implements IInstruction {
	
	public Input(Computer comp) {
		operation(comp);
		increaseIP(comp);
	}

	@Override
	public void operation(Computer comp) {
		System.out.println("Escriba un entero:");
		comp.stack().push(new IOHelper(comp).terminal().nextInt());
	}

}
