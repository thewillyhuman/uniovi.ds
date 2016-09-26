package io.guill.uniovi.ds.practica_2;

public class Jmp implements Instruction {
	
	int jump;
	
	public Jmp(int ins) {
		this.jump = ins;
	}
	
	public Jmp(String ins) {
		this.jump = Integer.parseInt(ins);
	}

	@Override
	public void operation(Computer comp) {
		comp.setIP(this.jump);
	}
	
	@Override
	public boolean isOperation(String name) {
		if(name.equals("jmp"))
			return true;
		return false;
	}

}
