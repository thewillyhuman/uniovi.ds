package io.guill.uniovi.ds.practica7.FileKit;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class NSFS {
	
	public static final NSFS FileSystem = new NSFS();
	
	private static final String path = "io/guill/uniovi/ds/practica7/docs/";
	
	private NSFS() {}
	
	public void copyFile(String name, IOOProtocol output) {
		byte[] encoded = null;
		try {
			encoded = Files.readAllBytes(Paths.get(path+name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			output.send(new String(encoded, "UTF-8"));
			output.close();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
