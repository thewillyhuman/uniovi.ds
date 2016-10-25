package io.guill.uniovi.ds.practica_7.mejoraInicial.normalizer;

import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Output;

import java.io.FileWriter;
import java.io.IOException;

public class TextNormalizer {
	
	public String normalize(String file, CharSequence match) {
		return file.replace(match, file);
	}
	
	public FileWriter toFile(String filename, String file, CharSequence match) {
		FileWriter filew = null;
		try {
			filew = new FileWriter(filename);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			filew.append(normalize(file, match));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return filew;
	}
	
	public Output normalize(Output file, CharSequence pattern) {
		normalize(file.toString(), pattern);
		return file;
	}

}
