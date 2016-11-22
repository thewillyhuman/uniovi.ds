package io.guill.uniovi.ds.practica_10.tasks;

import io.guill.uniovi.ds.practica_10.macro.Macros;

public class Execute {
	
	private String macroName;
	
	public Execute(String macroName) {
		this.macroName = macroName;
	}
	
	public void execute() {
		Macros.executeMacro(macroName);
	}

}
