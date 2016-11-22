package io.guill.uniovi.ds.practica_10.tasks;

import io.guill.uniovi.ds.practica_10.contracts.Action;
import io.guill.uniovi.ds.practica_10.macro.Macro;
import io.guill.uniovi.ds.practica_10.macro.Macros;

public class Graba {
	
	Macro m;

	public Graba(String macroName) {
		m = new Macro(macroName);
	}
	
	public Action insert(Action a) {
		m.addAction(a);
		return a;
	}
	
	public Macro save() {
		Macros.addMacro(m);
		return this.m;
	}
}
