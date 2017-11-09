package io.guill.uniovi.ds.practica7.IOKit;

import java.io.*;

public interface IOOProtocol {
	
	void send(char c) throws IOException;

	void close() throws IOException;
}
