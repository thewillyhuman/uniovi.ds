package io.guill.uniovi.ds.practica7.FileKit;

import java.io.*;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class NSFS {
	
	public static final NSFS FileSystem = new NSFS();
	
	private static final String path = "io/guill/uniovi/ds/practica7/docs/";
	
	private NSFS() {}
	
	public void copyFile(String name, IOOProtocol output) {
		try {
			FileReader reader = new FileReader(path + name);

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
