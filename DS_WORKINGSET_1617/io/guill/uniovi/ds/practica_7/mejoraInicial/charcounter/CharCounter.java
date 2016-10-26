package io.guill.uniovi.ds.practica_7.mejoraInicial.charcounter;

import java.io.IOException;

import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Output;

public class CharCounter implements Output {

	private Output output;
	private int counter;

	public CharCounter(Output output) {
		this.output = output;
	}

	@Override
	public void send(String c) throws IOException {
		output.send(c);
		counter = c.length();
	}

	@Override
	public void close() throws IOException {
		output.close();
		System.out.println("Characters copyed: " + counter);
	}

}
