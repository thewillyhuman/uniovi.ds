package io.guill.uniovi.ds.practica_3.herramientas;

public class Exit implements Tool {
	
	public final static int NORMAL = 0;
	public final static int ERROR = -1;
	
	public Exit(int status) {
		System.err.println(">> Suting down system...");
		System.exit(status);
	}
}
