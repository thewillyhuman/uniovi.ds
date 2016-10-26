package io.guill.uniovi.ds.practica_7.mejoraInicial.main;

import io.guill.uniovi.ds.files.Files;
import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Output;

import java.io.*;

public class FileSystem {
	
	String pathIn = Files.PATH_IN + "/practica_7/mejoraInicial/";

	public void copyFile(String name, Output output) {
		File file = new File(pathIn+name);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte[] data = new byte[(int) file.length()];
		try {
			fis.read(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str = null;
		try {
			str = new String(data, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			output.send(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
