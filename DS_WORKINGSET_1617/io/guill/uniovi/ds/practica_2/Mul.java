package io.guill.uniovi.ds.practica_2;

public class Mul implements Instruction {

	@Override
	public void operation(Computer comp) {
		new Push(new Pop().getValue(comp) * new Pop().getValue(comp));
	}
	
	@Override
	public boolean isOperation(String name) {
		if(name.equals("mul"))
			return true;
		return false;
	}

	@Override
	public void operation(Computer comp, String ins) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void increaseIP(Computer comp) {
		comp.increaseIP();
	}

}
