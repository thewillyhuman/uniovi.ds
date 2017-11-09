package io.guill.uniovi.ds.practica7.FileKit;

import java.io.IOException;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class FKFileNormalizer implements IOOProtocol {
	
	private IOOProtocol output = null;
	private String toReplace, replaceWith;
	
	public FKFileNormalizer(IOOProtocol output, String toReplace, String replaceWith) {
		this.output = output;
		this.toReplace = toReplace;
		this.replaceWith = replaceWith;
	}

	@Override
	public void send(char c) throws IOException {
		if(c == toReplace.toCharArray()[0])
			this.output.send(replaceWith.toCharArray()[0]);
		else
			this.output.send(c);
	}

	@Override
	public void close() throws IOException {
		this.output.close();
	}

}
