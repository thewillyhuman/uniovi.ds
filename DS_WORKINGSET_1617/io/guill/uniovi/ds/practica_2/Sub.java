package io.guill.uniovi.ds.practica_2;

public class Sub implements Instruction {

	@Override
	public void operation(Computer comp) {
		int b = new Pop().getValue(comp);
		int a = new Pop().getValue(comp);
		new Push(a - b).operation(comp);
	}
	
	@Override
	public boolean isOperation(String name) {
		if(name.equals("sub"))
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
