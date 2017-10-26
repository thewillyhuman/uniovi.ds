package io.guill.uniovi.ds.practica5;

import java.util.Stack;

public class Historical {
	
	// Unique instance of the Historical for every class to use.
	public final static Historical instance = new Historical();
	
	// The changes stacks.
	private Stack<State> undos, redos;
	
	private Historical() { 
		undos = new Stack<State>();
		redos = new Stack<State>();
	}
	
	/**
	 * Gives the instance to work with the historical.
	 * 
	 * @return the instance of the historical.
	 */
	public Historical instance() { return instance; }
	
	/**
	 * Adds a change to the historical.
	 * 
	 * @param change to add to the historical.
	 */
	public void newState(State change) {
		this.undos.push(change);
		redos.clear();
	}
	
	/**
	 * If possible will undo the last change.
	 */
	public State undo() {
		if(this.undos.isEmpty())
			System.err.println("Nothing to undo");
		State state = undos.pop();
		this.redos.push(state);
		System.out.println("Added a state to the redos list");
		return state;
	}
	
	/**
	 * If possible will re-do the last thing undone.
	 */
	public State redo() {
		if(this.redos.isEmpty())
			System.err.println("Nothing to undo");
		State state = redos.pop();
		this.undos.push(state);
		System.out.println("Added a state to the undos list");
		return state;
	}
	
	

}
