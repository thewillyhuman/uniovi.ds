package io.guill.uniovi.ds.practica7.FileKit;

import java.io.IOException;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class FKFileEncrypter implements IOOProtocol {

	private IOOProtocol output;
	
	public FKFileEncrypter(IOOProtocol output) {
		this.output = output;
	}
	
	@Override
	public void send(String c) throws IOException {
		StringBuilder encrypted = new StringBuilder();
		for(int i = 0; i < c.length(); i++) {
			char current = c.charAt(i);
			if(Character.isLetter(current) || Character.isDigit(current)) {
				encrypted.append(((char)((int)current+1)));
			} else {
				encrypted.append(current);
			}
		}
		this.output.send(encrypted.toString());
	}

	@Override
	public void close() throws IOException {
		this.output.close();
	}
	
	

}
