package io.guill.uniovi.ds.practica_7.mejoraInicial.cypher;

import java.util.Hashtable;

public class EncryptedLibrary {
	
	private static Hashtable<Integer, String> encryptedStrings = new Hashtable<Integer, String>();
	
	public static String getEncryptedString(String original) {
		return encryptedStrings.get(original.hashCode());
			
	}
	
	public static void insert(String original, String encrypted) {
		encryptedStrings.put(original.hashCode(), encrypted);
	}
}

