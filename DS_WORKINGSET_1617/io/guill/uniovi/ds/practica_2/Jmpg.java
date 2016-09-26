package io.guill.uniovi.ds.practica_2;

public class Jmpg implements Instruction {

	@Override
	public void operation(Computer comp) {
		
	}

	public void operation(Computer comp, String ins) {
		int b = new Pop().getValue(comp);
		int a = new Pop().getValue(comp);
		
		if (a > b)
			comp.setIP(Integer.parseInt(ins));
		else
			comp.increaseIP();
	}
	
	@Override
	public boolean isOperation(String name) {
		if (name.equals("jmpg"))
			return true;
		return false;
	}
	
	@Override
	public void increaseIP(Computer comp) {
		comp.increaseIP();
	}

}
