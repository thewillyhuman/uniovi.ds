package io.guill.uniovi.ds.practica_2;

public class Push implements Instruction {
	
	int value;
	
	public Push() {
	}
	
	public Push(int value) {
		this.value = value;
	}
	
	public void operation(Computer comp) {
		comp.setPila(comp.getPila(comp.getSP()), value);
		comp.increaseSP();
	}

	@Override
	public boolean isOperation(String name) {
		if(name.equals("push"))
			return true;
		return false;
	}

	@Override
	public void operation(Computer comp, String ins) {
		// TODO Auto-generated method stub
		
	}
}
