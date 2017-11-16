package io.guill.uniovi.ds.practica8;

import java.io.*;

import io.guill.uniovi.ds.practica8.ChartsKit.CKBarChart;
import io.guill.uniovi.ds.practica8.ChartsKit.CKComposedChart;
import io.guill.uniovi.ds.practica8.ChartsKit.CKPieChart;
import io.guill.uniovi.ds.practica8.ChartsKit.CKStatusLine;
import io.guill.uniovi.ds.practica8.PollKit.PKQuestion;

public class Main {

	public static void main(String[] args) throws IOException {
		TextUserInterface userInterface = new TextUserInterface();
		
		// First modification.
		PKQuestion encuesta = new PKQuestion("¿Está a favor de la energia nuclear?",
				new CKBarChart(), new CKPieChart(), new CKStatusLine());
		userInterface.rellena(encuesta);
		
		// Second modification.
		encuesta = new PKQuestion("¿Está a favor de la energia nuclear?",
				new CKPieChart(), new CKStatusLine());
		userInterface.rellena(encuesta);
		
		// Third modification.
		encuesta = new PKQuestion("¿Está a favor de la energia nuclear?",
				new CKBarChart(), new CKComposedChart(new CKPieChart(), 3, 1), new CKStatusLine());
		userInterface.rellena(encuesta);
		
		// Fourth modification.
		encuesta = new PKQuestion("¿Está a favor de la energia nuclear?",
				new CKBarChart(), new CKComposedChart(new CKPieChart(), 1, 3), new CKStatusLine());
		userInterface.rellena(encuesta);
		
		// Last modification.
		encuesta = new PKQuestion("¿Está a favor de la energia nuclear?",
				new CKBarChart(), new CKPieChart(), new CKComposedChart(new CKStatusLine(), 4, 2));
		userInterface.rellena(encuesta);
	}

}

