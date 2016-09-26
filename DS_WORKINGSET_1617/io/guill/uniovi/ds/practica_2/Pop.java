package io.guill.uniovi.ds.practica_2;

public class Pop implements Instruction {

	public int getValue(Computer comp) {
		operation(comp);
		return comp.getPila(comp.getSP());
	}

	@Override
	public boolean isOperation(String name) {
		if(name.equals("pop"))
			return true;
		return false;
	}

	@Override
	public void operation(Computer comp) {
		comp.decreaseSP();
	}

}
