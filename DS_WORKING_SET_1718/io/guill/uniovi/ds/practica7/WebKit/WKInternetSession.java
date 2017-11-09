package io.guill.uniovi.ds.practica7.WebKit;

import java.io.*;

import io.guill.uniovi.ds.practica7.Foundation.NSURL;
import io.guill.uniovi.ds.practica7.IOKit.IOOProtocol;

public class WKInternetSession implements IOOProtocol {
	
	public WKInternetSession(NSURL url) {
		stringWriter = new StringWriter();
		stringWriter.append("\n--- START Internet [" + url.value() + "]\n");
	}

	public void send(char c) throws IOException {
		stringWriter.append(c);
	}

	public void close() throws IOException {
		System.out.print(stringWriter.toString());
		System.out.println("\n--- END   Internet");
	}

	private StringWriter stringWriter = new StringWriter();
}
