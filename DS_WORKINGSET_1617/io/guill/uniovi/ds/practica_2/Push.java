package io.guill.uniovi.ds.practica_2;

public class Push implements Instruction {
	
	int value;
	
	public Push() {
	}
	
	public Push(int value) {
		this.value = value;
	}
	
	@Override
	public boolean isOperation(String name) {
		if(name.equals("push"))
			return true;
		return false;
	}

	public void operation(Computer comp) {
		comp.setPila(comp.getSP(), value);
		comp.increaseSP();
	}
}
