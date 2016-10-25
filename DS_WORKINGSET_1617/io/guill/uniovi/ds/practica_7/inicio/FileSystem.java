package io.guill.uniovi.ds.practica_7.inicio;

import io.guill.uniovi.ds.files.Files;

import java.io.*;

public class FileSystem {
	
	String pathIn = Files.PATH_IN + "/practica_7/inicio/";
	String pathOut = Files.PATH_OUT + "/practica_7/inicio/";

	public void copyFile(String name, String newName) throws IOException {
		FileWriter writer = new FileWriter(pathOut + newName);

		try {
			FileReader reader = new FileReader(pathIn + name);

			int c;
			while ((c = reader.read()) != -1)
				writer.append((char) c);

			reader.close();
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendToInternet(String name, String url) {
		try {
			StringWriter stringWriter = new StringWriter();
			stringWriter.append("\n--- START Internet[" + url + "]\n");

			FileReader reader = new FileReader(pathIn+name);

			int c;
			while ((c = reader.read()) != -1)
				stringWriter.append((char) c);

			reader.close();

			System.out.println(stringWriter.toString());
			System.out.println("--- END   Internet");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendWithBluetooth(String name, String device) {
		try {
			StringWriter stringWriter = new StringWriter();
			stringWriter.append("\n--- START Bluetooth[" + device + "]\n");

			FileReader reader = new FileReader(pathIn+name);

			int c;
			while ((c = reader.read()) != -1)
				stringWriter.append((char) c);

			reader.close();

			System.out.println(stringWriter.toString());
			System.out.println("--- END   Bluetooth");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
