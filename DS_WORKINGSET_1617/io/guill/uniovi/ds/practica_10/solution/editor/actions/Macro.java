package io.guill.uniovi.ds.practica_10.solution.editor.actions;

import io.guill.uniovi.ds.practica_10.solution.editor.Editor;

import java.util.*;


public class Macro implements Action
{
	private String name;
	private List<Action> actions = new ArrayList<>();
	
	public Macro(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}

	public void addAction(Action action)
	{
		actions.add(action);
	}
	
	@Override
	public void execute(Editor editor) 
	{
		for (Action action : actions) {
			action.execute(editor);
		}
	}

	@Override
	public String toString()
	{
		return "Macro " + name;
	}
}
