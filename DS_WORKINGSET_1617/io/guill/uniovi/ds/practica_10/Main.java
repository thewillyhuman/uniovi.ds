package io.guill.uniovi.ds.practica_10;

import io.guill.uniovi.ds.files.Files;
import io.guill.uniovi.ds.practica_10.actions.Abre;
import io.guill.uniovi.ds.practica_10.actions.Borra;
import io.guill.uniovi.ds.practica_10.actions.Inserta;
import io.guill.uniovi.ds.practica_10.actions.Reemplaza;
import io.guill.uniovi.ds.practica_10.tasks.Execute;
import io.guill.uniovi.ds.practica_10.tasks.Graba;
import io.guill.uniovi.ds.practica_10.tasks.Parar;

import java.io.*;
import java.util.regex.*;

import sun.text.resources.cldr.sr.FormatData_sr_Cyrl_BA;

public class Main 
{
	private static BufferedReader in;
	private static StringBuilder texto;
	private static Graba graba;

	public static void main(String[] args) throws IOException 
	{
		in = new BufferedReader(new InputStreamReader(System.in));
		texto = new StringBuilder("");

		System.out.println("Acciones");
		System.out.println("--------");
		System.out.println("abre <fichero>");
		System.out.println("inserta <texto>\t\t// inserta las palabras al final del texto");
		System.out.println("borra\t\t\t// borra la √∫ltima palabra");
		System.out.println("reemplaza <a> <b>\t// reemplaza la cadena <a> por la <b> en todo el texto");
		System.out.println("salir");
		System.out.println();
		System.out.println("Tareas");
		System.out.println("------");
		System.out.println("graba <macro>\t\t// comienza la grabaci√≥n de una macro");
		System.out.println("para\t\t\t// finaliza la grabaci√≥n");
		System.out.println("ejecuta <macro>\t\t// ejecuta la macro cuyo nombre se indique");
		System.out.println();

		do {
			System.out.print("> ");

			String[] line = in.readLine().split(" ");
			
			// Para cada instrucciÛn si es igual al nombre de la instrucciÛn ejecutala.
			
			if(line[0].equals(Abre.name)) {
				texto = new Abre(texto, line[1]).execute();
			} else if(line[0].equals(Borra.name)) {
				texto = new Borra(texto).execute();
			} else if(line[0].equals(Inserta.name)) {
				texto = new Inserta(texto, line[1]).execute();
			} else if(line[0].equals(Reemplaza.name)) {
				texto = new Reemplaza(texto, line[1], line[2]).execute();
			}
			
			// No se comprueba que el n√∫mero de palabras sea el adecuado

			/*if (line[0].equals("salir"))
				return;

			if (line[0].equals("abre")) {
				texto = new Abre(line[1]).execute();

				
			} else if (line[0].startsWith("ins")) {
				
				for (int i = 1; i < line.length; i++) {
					texto = new Inserta(texto, line[i]+" ").execute();

				}
				
			} else if (line[0].startsWith("borr")) {
				
				texto = new Borra(texto).execute();

				
			} else if (line[0].startsWith("reem")) {
				texto = new Reemplaza(texto, line[1], line[2]).execute();
				
			} else if (line[0].startsWith("graba")) {
				
				graba = new Graba(line[1]);
				
			} else if (line[0].startsWith("para")) {
				
				new Parar(graba).execute();
				graba = null;
				
			} else if (line[0].startsWith("ejecuta")) {
				
				new Execute(line[1]).execute();
				
			} else {
				
				System.out.println("InstrucciÛn desconocida");
				
			}*/
			System.out.println(texto);
			
		} while (true);
	}

	public static StringBuilder readFile(String filename) throws IOException 
	{
		BufferedReader input = new BufferedReader(new FileReader(Files.PATH_IN + "/practica_10/" +filename));
		String line;
		StringBuilder result = new StringBuilder();
		while ((line = input.readLine()) != null) {
			result.append(line);
		}
		input.close();
		return result;
	}
}
