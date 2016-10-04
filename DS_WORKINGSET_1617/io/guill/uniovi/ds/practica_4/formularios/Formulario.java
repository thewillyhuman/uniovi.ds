package io.guill.uniovi.ds.practica_4.formularios;


import java.util.*;

import io.guill.uniovi.ds.practica_4.campos.Campo;

public class Formulario {
	
	private List<Campo> campos = new ArrayList<Campo>();
	
	public void addCampo(Campo campo) {
		campos.add(campo);
	}

	public void PideDatos() {
		for (Campo campo : campos) {
			campo.pideDato();
			System.out.println(campo.getString());
		}
	}
}
