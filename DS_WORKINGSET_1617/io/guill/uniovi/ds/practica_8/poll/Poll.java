package io.guill.uniovi.ds.practica_8.poll;

import io.guill.uniovi.ds.practica_8.graficos.Grafico;

public class Poll {
	private int yeses, nos;
	private String question;

	Grafico[] graficos;

	public Poll(String question, Grafico... graficos) {
		this.question = question;
		this.graficos = graficos;
	}

	public String getQuestion() {
		return question;
	}

	public int getYeses() {
		return yeses;
	}

	public int getNos() {
		return nos;
	}

	public void incrementYeses() {
		yeses++;
		actualizarGraficos();
	}

	public void incrementNos() {
		nos++;
		actualizarGraficos();
	}

	public void actualizarGraficos() {
		for (Grafico g : graficos) {
			g.update(yeses, nos);
		}

	}
}
