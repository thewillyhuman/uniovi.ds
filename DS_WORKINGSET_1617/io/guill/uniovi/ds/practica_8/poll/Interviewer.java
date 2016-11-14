package io.guill.uniovi.ds.practica_8.poll;

import java.io.*;

public class Interviewer 
{
	private BufferedReader input;

	public void fill(Poll poll) throws IOException 
	{
		input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Acciones: [si] / [no]");

		while (true) {
			System.out.println();
			System.out.println("Pregunta: " + poll.getQuestion());
			System.out.print(">");

			String[] line = input.readLine().split(" ");

			if (line[0].equals("exit"))
				return;

			if (line[0].equals("si"))
				poll.incrementYeses();

			if (line[0].equals("no"))
				poll.incrementNos();
		}
	}
}

