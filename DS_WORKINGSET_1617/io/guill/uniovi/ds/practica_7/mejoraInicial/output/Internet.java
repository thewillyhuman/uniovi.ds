package io.guill.uniovi.ds.practica_7.mejoraInicial.output;

import io.guill.uniovi.ds.practica_7.mejoraInicial.cypher.TextEncrypter;

import java.io.*;

public class Internet implements Output {
	
	public Internet(String url) {
		stringWriter = new StringWriter();
		stringWriter.append("\n--- START Internet[" + url + "]\n");
	}
	
	public void send(char c) throws IOException {
		stringWriter.append(c);
	}

	public void close() throws IOException {
		System.out.print(new TextEncrypter().encrypt(stringWriter.toString()));
		System.out.println("--- END   Internet");
	}
	
	public String toString() {
		return this.stringWriter.toString();
	}

	private StringWriter stringWriter = new StringWriter();
}
