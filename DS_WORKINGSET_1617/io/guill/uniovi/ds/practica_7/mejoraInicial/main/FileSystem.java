package io.guill.uniovi.ds.practica_7.mejoraInicial.main;

import io.guill.uniovi.ds.files.Files;
import io.guill.uniovi.ds.practica_7.mejoraInicial.cypher.TextEncrypter;
import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Output;

import java.io.*;

public class FileSystem {
	
	String pathIn = Files.PATH_IN + "/practica_7/mejoraInicial/";

	public void copyFile(String name, Output output) {
		try {
			FileReader reader = new FileReader(pathIn + name);

			int c;
			while ((c = reader.read()) != -1)
				output.send((char) c);

			reader.close();
			output.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
