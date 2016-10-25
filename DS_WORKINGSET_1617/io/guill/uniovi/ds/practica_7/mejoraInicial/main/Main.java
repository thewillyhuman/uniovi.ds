package io.guill.uniovi.ds.practica_7.mejoraInicial.main;

import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Bluetooth;
import io.guill.uniovi.ds.practica_7.mejoraInicial.output.FileOutput;
import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Internet;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem system = new FileSystem();

		system.copyFile("privado.txt", new FileOutput("copia.txt"));
		system.copyFile("privado.txt", new Internet("1.1.1.1"));
		system.copyFile("privado.txt", new Bluetooth("iPhone"));

	}

}
