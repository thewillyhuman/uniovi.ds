package io.guill.uniovi.ds.practica_7.mejoraInicial.cypher;

import java.io.IOException;

import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Output;

public class TextEncrypter implements Output {
	
	private Output output;

	public TextEncrypter(Output output) {
		this.output = output;
	}
	
	private char encrypt(char c) {
		return ((char) (((int) c)+1));
	}
	
	public String encrypt(String s) {
		StringBuilder cyph = new StringBuilder();
		for(char c: s.toCharArray())
			cyph.append(encrypt(c));
		return cyph.toString();
	}

	@Override
	public void send(String c) throws IOException {
		String encrypted;
		String fromLibrary = EncryptedLibrary.getEncryptedString(c);
		if(fromLibrary==null) {
			encrypted = encrypt(c);
			output.send(encrypted);
			EncryptedLibrary.insert(c, encrypted);
		} else { 
			output.send(fromLibrary);
		}		
	}

	@Override
	public void close() throws IOException {
		output.close();
	}

}
