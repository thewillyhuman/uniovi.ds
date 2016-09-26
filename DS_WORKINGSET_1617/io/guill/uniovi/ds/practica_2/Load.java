package io.guill.uniovi.ds.practica_2;

public class Load implements Instruction {

	@Override
	public void operation(Computer comp) {
		int direccion = new Pop().getValue(comp);
		new Push(comp.getMemmoria(direccion));
	}

	@Override
	public boolean isOperation(String name) {
		if(name.equals("load"))
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
