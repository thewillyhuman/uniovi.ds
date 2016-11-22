package io.guill.uniovi.ds.practica_10.macro;

import java.util.ArrayList;
import java.util.List;

public class Macros {

	public static List<Macro> macros = new ArrayList<Macro>();
	
	public static void addMacro(Macro m) {
		macros.add(m);
	}
	
	public static void executeMacro(Macro m) {
		if(macros.contains(m))
			m.execute();
	}
	
	public static void executeMacro(String macroName) {
		for(Macro m : macros) {
			if(m.getName().equals(macroName))
				m.execute();
		}
	}
}
