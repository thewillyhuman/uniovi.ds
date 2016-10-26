package io.guill.uniovi.ds.practica_7.mejoraInicial.output;

import io.guill.uniovi.ds.files.Files;

import java.io.*;

public class FileOutput implements Output {

	String pathOut = Files.PATH_OUT + "/practica_7/mejoraInicial/";
	public String fileName;

	public FileOutput(String fileName) throws IOException {
		file = new FileWriter(pathOut + fileName);
		this.fileName = fileName;
	}

	public void send(String c) throws IOException {
		file.append(c);
	}

	public void close() throws IOException {
		file.close();
	}

	public String toString() {
		return file.toString();
	}

	public FileWriter getFile() {
		return this.file;
	}

	private FileWriter file;
}
