package io.guill.uniovi.ds.practica7.FileKit;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class NSFS {
	
	public static final NSFS FileSystem = new NSFS();
	
	public static final String RELATIVE_PATH = "io/guill/uniovi/ds/practica7/docs/";
	public static final String DEFAULT_ENCODING = "UTF-8";
	
	private NSFS() {}
	
	public void copyFile(String name, IOOProtocol output) {
		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get(RELATIVE_PATH+name));
			output.send(new String(encoded, DEFAULT_ENCODING));
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
