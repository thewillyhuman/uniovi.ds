package io.guill.uniovi.ds.practica_8;

import java.io.IOException;

import io.guill.uniovi.ds.practica_8.graficos.*;
import io.guill.uniovi.ds.practica_8.poll.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Grafico barras = new GraficoBarras();
		Grafico circular = new GraficoCircular();
		Grafico guardar = new GraficoGuardar();
		Grafico estadoVotacion = new GraficoEstadoVotacion();

		Interviewer interviewer = new Interviewer();

		// ENCUESTA 2
		Poll poll2 = new Poll("¿Está a favor de la energia nuclear?", barras, circular, estadoVotacion, guardar);
		interviewer.fill(poll2);

		// ENCUESTA 3
		Poll poll3 = new Poll("¿Está a favor de la energia nuclear?", circular, estadoVotacion, guardar);
		interviewer.fill(poll3);

		// ENCUESTA 4
		Poll poll4 = new Poll("¿Está a favor de la energia nuclear?", new GraficoContador(circular, 3), estadoVotacion,
				guardar);
		interviewer.fill(poll4);

		// ENCUESTA 5
		Poll poll5 = new Poll("¿Está a favor de la energia nuclear?", new GraficoContador(barras, 4),
				new GraficoContador(circular, 3), estadoVotacion, guardar);
		interviewer.fill(poll5);
	}
}
