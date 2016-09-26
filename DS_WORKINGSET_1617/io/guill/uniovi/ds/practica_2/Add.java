package io.guill.uniovi.ds.practica_2;

public class Add implements Instruction {
	
	@Override
	public void operation(Computer comp) {
		Pop pop = new Pop();
		Push push = new Push(pop.getValue(comp) + pop.getValue(comp));
		push.operation(comp);
		comp.increaseIP();
	}
	
	@Override
	public boolean isOperation(String name) {
		if(name.equals("add"))
			return true;
		return false;
	}

}
