package io.guill.uniovi.ds.practica7.FileKit;

import java.io.IOException;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class FKFileOutput implements IOOProtocol {
	
	private FKFile file;
	
	public FKFileOutput(FKFile file) {
		this.file = file;
	}

	@Override
	public void send(char c) throws IOException {
		file.file().append(c);
	}

	@Override
	public void close() throws IOException {
		file.file().close();
	}

}
