package io.guill.uniovi.ds.practica_10.tasks;

public class Parar {
	
	private Graba current;
	
	public Parar(Graba current) {
		this.current = current;
	}
	
	public void execute() {
		current.save();
	}

}
