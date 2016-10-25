package io.guill.uniovi.ds.practica_7.mejoraInicial.cypher;

public class TextEncrypter {
	
	private char encrypt(char c) {
		return ((char) (((int) c)+1));
	}
	
	public String encrypt(String s) {
		StringBuilder cyph = new StringBuilder();
		for(char c: s.toCharArray())
			cyph.append(encrypt(c));
		return cyph.toString();
	}

}
