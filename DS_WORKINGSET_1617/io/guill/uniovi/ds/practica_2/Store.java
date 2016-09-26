package io.guill.uniovi.ds.practica_2;

public class Store implements Instruction {

	@Override
	public boolean isOperation(String name) {
		if(name.equals("store"))
			return true;
		return false;
	}

	@Override
	public void operation(Computer comp) {
		int valor = new Pop().getValue(comp);
		int direccion = new Pop().getValue(comp);
		comp.setMemoria(direccion, valor);
		comp.increaseIP();
	}
}
