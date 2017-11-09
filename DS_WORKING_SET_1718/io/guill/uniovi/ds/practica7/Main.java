package io.guill.uniovi.ds.practica7;

import java.io.*;

import io.guill.uniovi.ds.practica7.FileKit.*;
import io.guill.uniovi.ds.practica7.Foundation.*;
import io.guill.uniovi.ds.practica7.IOBluetooth.*;
import io.guill.uniovi.ds.practica7.WebKit.*;

public class Main {
	public static void main(String[] args) throws IOException {

		NSFS.FileSystem.copyFile("privado.txt",
				new FKFileNormalizer(new FKFileOutput(new FKFile("copia.txt")), "\r", ""));
		NSFS.FileSystem.copyFile("privado.txt",
				new FKFileEncrypter(new WKInternetSession(new NSURL("156.17.11.196"))));
		NSFS.FileSystem.copyFile("privado.txt",
				new IOBluetoothSession("Galaxy de Raúl"));

		// Reference Design
		System.err.println("\n-- REFERENCE DESIGN --\n");
		NSFS.FileSystem.copyFile("privado.txt", new FKFiletNormalizer(new FKFileOutput(new FKFile("copia.txt")), "\r", ""));
		NSFS.FileSystem.copyFile("privado.txt", new FKFileEncrypter(new WKInternetSession(new NSURL("1.1.1.1"))));
		NSFS.FileSystem.copyFile("privado.txt", new FKFileEncrypter(new FKFiletNormalizer(new IOBluetoothSession("iPhone"), "  ", " ")));

		// First Modification
		System.err.println("\n-- FIRST MODIFICATION --\n");
		NSFS.FileSystem.copyFile("privado.txt", new FKFiletNormalizer(new FKFileOutput(new FKFile("a.txt")), "\r", ""));
		NSFS.FileSystem.copyFile("privado.txt", new FKFileEncrypter(new FKFiletNormalizer(new FKFileOutput(new FKFile(("b.txt"))), "\r", "")));

		// Second Modification
		System.err.println("\n-- SECOND MODIFICATION --");
		NSFS.FileSystem.copyFile("privado.txt", new FKFileEncrypter(new WKInternetSession(new NSURL("1.1.1.1"))));
		NSFS.FileSystem.copyFile("privado.txt", new FKFiletNormalizer(new FKFileEncrypter(new WKInternetSession(new NSURL("1.1.1.1"))), " ", "  "));
		NSFS.FileSystem.copyFile("privado.txt", new FKFiletNormalizer(new FKFileEncrypter(new WKInternetSession(new NSURL("1.1.1.1"))), "\r", ""));
		NSFS.FileSystem.copyFile("privado.txt", new FKFiletNormalizer(
				new FKFiletNormalizer(new FKFileEncrypter(new WKInternetSession(new NSURL("1.1.1.1"))), "\r", ""), "  ", " "));

	}
}
