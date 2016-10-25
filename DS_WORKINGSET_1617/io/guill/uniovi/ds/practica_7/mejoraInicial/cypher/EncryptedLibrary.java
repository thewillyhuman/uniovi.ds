package io.guill.uniovi.ds.practica_7.mejoraInicial.cypher;

import java.util.Hashtable;

public class EncryptedLibrary {
	
	private static Hashtable<int, EncryptedString> encryptedStrings = new Hashtable<int, EncryptedString>();
	
	public String getEncryptedString(String original) {
		if(contains(original))
			return encryptedStrings.get(original.hashCode()).getEncrypted();
		return null;
			
	}
	
	public void insert(String original) {
		encryptedStrings.put(original.hashCode(), new EncryptedString(original, new TextEncrypter().encrypt(original)));
	}
	
	private boolean contains(String original) {
		if(encryptedStrings.contains(original.hashCode()))
			return true;
		return false;
	}

	
	
	public class EncryptedString {
		private String original, encrypted;
		
		public EncryptedString(String original, String encrypted) {
			this.original = original;
			this.encrypted=encrypted;
		}
		
		public String getOriginal() {
			return this.original;
		}
		
		public String getEncrypted() {
			return this.encrypted;
		}
	}
}

