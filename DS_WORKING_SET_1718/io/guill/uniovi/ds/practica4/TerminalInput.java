package io.guill.uniovi.ds.practica4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import io.guill.uniovi.ds.practica4.fields.Field;

public class TerminalInput {

	public TerminalInput(Field campo) {
		BufferedReader terminal = new BufferedReader(new InputStreamReader(System.in));
		boolean valid;
		do {
			valid = false;
			try {
				System.out.print(campo.name() + ": ");
				campo.content(terminal.readLine());
				valid = campo.validate();
			} catch (IOException ex) {
				System.out.println(ex);
			}
		} while (!valid);
	}
}
