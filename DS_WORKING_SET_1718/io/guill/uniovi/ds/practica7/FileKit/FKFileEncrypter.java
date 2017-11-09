package io.guill.uniovi.ds.practica7.FileKit;

import java.io.IOException;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class FKFileEncrypter implements IOOProtocol {

	private IOOProtocol output;
	
	public FKFileEncrypter(IOOProtocol output) {
		this.output = output;
	}
	
	@Override
	public void send(char c) throws IOException {
		this.output.send(((char)((int)c+1)));
		
	}

	@Override
	public void close() throws IOException {
		this.output.close();
	}
	
	

}
