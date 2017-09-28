package io.guill.uniovi.ds.practica2;

public class Sub implements IInstruction {
	
	public Sub(Computer comp) {
		operation(comp);
		increaseIP(comp);
	}

	@Override
	public void operation(Computer comp) {
		int b = comp.stack().pop();
		int a = comp.stack().pop();
		comp.stack().push(a - b);
	}

}
