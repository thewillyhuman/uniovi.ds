package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;
import io.guill.uniovi.ds.practica2.IOHelper;

public class Input implements IInstruction {

	@Override
	public void operation(Computer comp) {
		System.out.println("Escriba un entero:");
		new Push(new IOHelper(comp).terminal().nextInt()).operation(comp);
		new IncreaseIP().operation(comp);
	}

}
