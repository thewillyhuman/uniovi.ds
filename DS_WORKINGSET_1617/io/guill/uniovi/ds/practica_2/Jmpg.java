package io.guill.uniovi.ds.practica_2;

public class Jmpg implements Instruction {
	
	int jump;
	
	public Jmpg(int ins) {
		this.jump = ins;
	}
	
	public Jmpg(String ins) {
		this.jump = Integer.parseInt(ins);
	}

	@Override
	public void operation(Computer comp) {
		int b = new Pop().getValue(comp);
		int a = new Pop().getValue(comp);
		
		if (a > b)
			comp.setIP(this.jump);
		else
			comp.increaseIP();
	}
	
	@Override
	public boolean isOperation(String name) {
		if (name.equals("jmpg"))
			return true;
		return false;
	}
}
