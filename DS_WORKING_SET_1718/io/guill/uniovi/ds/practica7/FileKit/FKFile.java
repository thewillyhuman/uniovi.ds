package io.guill.uniovi.ds.practica7.FileKit;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FKFile {

	private FileWriter content = null;

	public FKFile(String path) {
		try {
			content = new FileWriter(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public FileWriter file() {
		return this.content;
	}
	
	public String fileAsString() {
		return this.content.toString();
	}

	public void loadFromPath(String path) {
		try {
			FileReader reader = new FileReader(path);

			int c;
			while ((c = reader.read()) != -1)
				content.append((char) c);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
