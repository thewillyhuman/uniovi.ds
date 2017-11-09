package io.guill.uniovi.ds.practica7.FileKit;

import java.io.FileWriter;
import java.io.IOException;

public class FKFile {

	private FileWriter content = null;

	public FKFile(String fileName) {
		try {
			content = new FileWriter(NSFS.RELATIVE_PATH+fileName);
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
}
