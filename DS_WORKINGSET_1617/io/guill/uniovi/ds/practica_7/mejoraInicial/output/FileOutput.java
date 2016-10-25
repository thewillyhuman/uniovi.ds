package io.guill.uniovi.ds.practica_7.mejoraInicial.output;


import io.guill.uniovi.ds.files.Files;
import io.guill.uniovi.ds.practica_7.mejoraInicial.normalizer.TextNormalizer;

import java.io.*;

public class FileOutput implements Output {
	
	String pathOut = Files.PATH_OUT + "/practica_7/mejoraInicial/";
	public String fileName;

	public FileOutput(String fileName) throws IOException {
		file = new FileWriter(pathOut + fileName);
		this.fileName=fileName;
	}

	public void send(char c) throws IOException {
		file.append(c);
	}

	public void close() throws IOException {
		file = new TextNormalizer().toFile(pathOut + fileName, file.toString(), String.valueOf('\r'));
	}
	
	public String toString() {
		return file.toString();
	}
	public FileWriter getFile() {
		return this.file;
	}

	private FileWriter file;
}
