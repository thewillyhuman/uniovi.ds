package io.guill.uniovi.ds.practica7.FileKit;

import java.io.IOException;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class FKFiletNormalizer implements IOOProtocol {
	
	private IOOProtocol output;
	private CharSequence toReplace, target;
	
	public FKFiletNormalizer(IOOProtocol output, CharSequence target, CharSequence toReplace) {
		this.output = output;
		this.toReplace = toReplace;
		this.target = target;
	}

	@Override
	public void send(char c) throws IOException {
		this.output.send(c);
	}

	@Override
	public void close() throws IOException {
		this.output.close();
	}


}
