package io.guill.uniovi.ds.practica_7.mejoraInicial.output;

import java.io.*;

public class Internet implements Output {
	
	public Internet(String url) {
		stringWriter = new StringWriter();
		stringWriter.append("\n--- START Internet[" + url + "]\n");
	}
	
	public void send(String c) throws IOException {
		stringWriter.append(c);
	}

	public void close() throws IOException {
		System.out.print(stringWriter.toString());
		System.out.println("--- END   Internet");
	}
	
	public String toString() {
		return this.stringWriter.toString();
	}

	private StringWriter stringWriter = new StringWriter();
}
