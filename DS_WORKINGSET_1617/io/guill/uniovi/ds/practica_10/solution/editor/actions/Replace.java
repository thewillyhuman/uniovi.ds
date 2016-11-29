package io.guill.uniovi.ds.practica_10.solution.editor.actions;

import io.guill.uniovi.ds.practica_10.solution.editor.Editor;

import java.util.regex.Pattern;


public class Replace implements Action
{
	private String source, destination;
	
	public Replace(String source, String destination) 
	{
		if (source == null || destination == null)
			throw new IllegalArgumentException("La operación de reemplazo necesita la cadena de origen y de destino");
		this.source = source;
		this.destination = destination;
	}
	
	@Override
	public void execute(Editor editor) 
	{
		String newText = editor.getText().toString().replaceAll(Pattern.quote(source), destination);
		editor.setText(new StringBuilder(newText));
	}
	
	@Override
	public String toString()
	{
		return "Reemplazar " + source + " por " + destination;
	}
}
