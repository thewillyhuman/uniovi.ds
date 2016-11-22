package io.guill.uniovi.ds.practica_10.macro;

import io.guill.uniovi.ds.practica_10.contracts.Action;

import java.util.ArrayList;
import java.util.List;

public class Macro {
	
	private String name;
	private List<Action> actions;
	
	public Macro(String name) {
		this.name = name;
		actions = new ArrayList<Action>();
	}
	
	public String getName() { return this.name; }
	
	public void addAction(Action a) {
		actions.add(a);
	}
	
	public void removeAction(Action a) {
		actions.remove(a);
	}
	
	public void execute() {
		for(Action a : actions) {
			a.execute();
		}
	}

}
