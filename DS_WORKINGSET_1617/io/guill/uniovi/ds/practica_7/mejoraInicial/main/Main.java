package io.guill.uniovi.ds.practica_7.mejoraInicial.main;

import io.guill.uniovi.ds.practica_7.mejoraInicial.charcounter.CharCounter;
import io.guill.uniovi.ds.practica_7.mejoraInicial.cypher.TextEncrypter;
import io.guill.uniovi.ds.practica_7.mejoraInicial.normalizer.TextNormalizer;
import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Bluetooth;
import io.guill.uniovi.ds.practica_7.mejoraInicial.output.FileOutput;
import io.guill.uniovi.ds.practica_7.mejoraInicial.output.Internet;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		FileSystem system = new FileSystem();

		// Reference Design
		System.err.println("\n-- REFERENCE DESIGN --\n");
		system.copyFile("privado.txt", new TextNormalizer(new FileOutput("copia.txt"), "\r", ""));
		system.copyFile("privado.txt", new TextEncrypter(new Internet("1.1.1.1")));
		system.copyFile("privado.txt", new TextEncrypter(new TextNormalizer(new Bluetooth("iPhone"), "  ", " ")));
		
		// First Modification
		System.err.println("\n-- FIRST MODIFICATION --\n");
		system.copyFile("privado.txt", new TextNormalizer(new FileOutput("a.txt"), "\r", ""));
		system.copyFile("privado.txt", new TextEncrypter(new TextNormalizer(new FileOutput("b.txt"), "\r", "")));
		
		// Second Modification
		System.err.println("\n-- SECOND MODIFICATION --");
		system.copyFile("privado.txt", new TextEncrypter(new Internet("1.1.1.1")));
		system.copyFile("privado.txt", new TextNormalizer(new TextEncrypter(new Internet("1.1.1.1"))," ","  "));
		system.copyFile("privado.txt", new TextNormalizer(new TextEncrypter(new Internet("1.1.1.1")),"\r",""));
		system.copyFile("privado.txt", new TextNormalizer(new TextNormalizer(new TextEncrypter(new Internet("1.1.1.1")),"\r",""), "  ", " "));
		
		// Third Modification
		System.err.println("\n-- THIRD MODIFICATION --\n");
		system.copyFile("privado.txt", new TextNormalizer(new CharCounter(new FileOutput("copia.txt")), "\r", ""));
		system.copyFile("privado.txt", new TextEncrypter(new CharCounter(new Internet("1.1.1.1"))));
		system.copyFile("privado.txt", new TextEncrypter(new CharCounter(new TextNormalizer(new Bluetooth("iPhone"), "  ", " "))));
		
		// Testing the encrypted library.
		// First an unencrypted file.
		long init1 = System.currentTimeMillis();
		system.copyFile("test.txt", new TextEncrypter(new FileOutput("elquijoteA.txt")));
		long end1 = System.currentTimeMillis();
		long time1 = end1-init1;
		
		// Then an encrypted file.
		long init2 = System.currentTimeMillis();
		system.copyFile("test.txt", new TextEncrypter(new FileOutput("elquijoteB.txt")));
		long end2 = System.currentTimeMillis();
		// We take the measures and print the result.
		long time2 = end2-init2;
		System.out.println(time1);
		System.out.println(time2);
		System.out.println("The library speeds up the performance: " + time1/time2 * 100 + "%");
	}

}
