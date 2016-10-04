package io.guill.uniovi.ds.practica_4.core;

import io.guill.uniovi.ds.practica_4.fields.*;
import io.guill.uniovi.ds.practica_4.forms.Formulario;

public class Main {

	public static void main(String[] args) {
		Formulario formulario = new Formulario();

		formulario.addCampo(new CampoTexto("Nombre"));
		formulario.addCampo(new CampoTexto("Apellido"));
		formulario.addCampo(new CampoNumero("Teléfono"));
		formulario.addCampo(new CampoPredefinido("Ciudad", "Santander", "Oviedo", "Cádiz"));
		formulario.addCampo(new CampoCodigoProd("Cod. Prod"));
		formulario.addCampo(new CampoCodigoPostal("Código Postal"));
		formulario.addCampo(new CampoEdad("Edad"));
		formulario.addCampo(new CampoSueldo("Sueldo"));
		formulario.addCampo(new CampoUbicacion("Ubicación",  "Santander", "Oviedo", "Cádiz"));
		formulario.addCampo(new CampoCodigoPromocion("Promoción"));
		
		formulario.PideDatos();
	}
}
