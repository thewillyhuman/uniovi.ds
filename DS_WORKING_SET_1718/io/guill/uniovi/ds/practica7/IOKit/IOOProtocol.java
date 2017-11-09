package io.guill.uniovi.ds.practica7.IOKit;

import java.io.*;

public interface IOOProtocol {
	
	/**
	 * Simulates the sending of information by means of an string.
	 * 
	 * @param c is the information to send.
	 * @throws IOException.
	 */
	void send(String c) throws IOException;

	/**
	 * Closes the connection.
	 * 
	 * @throws IOException
	 */
	void close() throws IOException;
}
