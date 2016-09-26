package io.guill.uniovi.ds.practica_2;

public class Jmp implements Instruction {
	

	@Override
	public void operation(Computer comp) {
	}
	
	public void operation(Computer comp, String ins) {
		comp.setIP(Integer.parseInt(ins));
	}
	
	@Override
	public boolean isOperation(String name) {
		if(name.equals("jmp"))
			return true;
		return false;
	}
	
	@Override
	public void increaseIP(Computer comp) {
		comp.increaseIP();
	}

}
