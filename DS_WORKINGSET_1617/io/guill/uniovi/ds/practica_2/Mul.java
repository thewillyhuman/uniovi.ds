package io.guill.uniovi.ds.practica_2;

public class Mul implements Instruction {

	@Override
	public boolean isOperation(String name) {
		if(name.equals("mul"))
			return true;
		return false;
	}
	
	@Override
	public void operation(Computer comp) {
		new Push(new Pop().getValue(comp) * new Pop().getValue(comp)).operation(comp);
		comp.increaseIP();
	}
}
