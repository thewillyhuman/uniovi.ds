package io.guill.uniovi.ds.practica_2;

public class Load implements Instruction {

	@Override
	public boolean isOperation(String name) {
		if(name.equals("load"))
			return true;
		return false;
	}

	@Override
	public void operation(Computer comp) {
		int direccion = new Pop().getValue(comp);
		new Push(comp.getMemoria(direccion)).operation(comp);;
		comp.increaseIP();
	}

}
