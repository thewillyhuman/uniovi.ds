package io.guill.uniovi.ds.practica7.FileKit;

import java.io.IOException;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class FKFileNormalizer implements IOOProtocol {
	
	private IOOProtocol output = null;
	private String target, replacement;
	
	public FKFileNormalizer(IOOProtocol output, String toReplace, String replaceWith) {
		this.output = output;
		this.target = toReplace;
		this.replacement = replaceWith;
	}

	@Override
	public void send(String c) throws IOException {
		this.output.send(c.replaceAll(target, replacement));
	}

	@Override
	public void close() throws IOException {
		this.output.close();
	}

}
