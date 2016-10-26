package io.guill.uniovi.ds.practica_7.mejoraInicial.normalizer;

import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Output;

import java.io.IOException;

public class TextNormalizer implements Output {
	
	private Output output;
	private CharSequence toReplace, target;
	
	public TextNormalizer(Output output,CharSequence target ,CharSequence toReplace) {
		this.output = output;
		this.toReplace = toReplace;
		this.target = target;
	}

	@Override
	public void send(String c) throws IOException {
		System.out.println("Characters before normalizing: " + c.length());
		output.send(c.replace(target, toReplace));
	}

	@Override
	public void close() throws IOException {
		output.close();
	}

}
