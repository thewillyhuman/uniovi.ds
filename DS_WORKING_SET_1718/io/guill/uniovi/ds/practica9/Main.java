package io.guill.uniovi.ds.practica9;

import java.util.*;

import io.guill.uniovi.ds.practica9.nodos.*;
import io.guill.uniovi.ds.practica9.recorrerarboles.RecorridoRecursivo;
import io.guill.uniovi.ds.practica9.visitor.CompileVisitor;
import io.guill.uniovi.ds.practica9.visitor.PrintVisitor;

public class Main {

	public static void main(String[] args) {
		/*
		 * read ancho; read alto; area = alto * ancho / 2; print area + 10;
		 */

		List<Sentencia> sentencias = new ArrayList<Sentencia>();

		// read ancho;
		sentencias.add(new Read(new Variable("ancho")));

		// read alto;
		sentencias.add(new Read(new Variable("alto")));

		// area = alto * ancho / 2;
		Producto prod = new Producto(new Variable("alto"),
				new Variable("ancho"));
		sentencias.add(new Asignacion(new Variable("area"),
				new Division(prod, new ConstanteInt("2"))));

		// print area + 10;
		sentencias.add(new Print(
				new Suma(new Variable("area"), new ConstanteInt("10"))));

		Programa prog = new Programa(sentencias);

		System.out.println("\n--- Recorrido Recursivo: todo en un m�todo");
		RecorridoRecursivo rr = new RecorridoRecursivo();
		rr.visit(prog);

		// No compila
		System.out.println("\n--- Recorrido ideal: no compila");
		// VersionIdeal ideal = new VersionIdeal();
		// ideal.visit(prog);

		// Que funcione lo siguiente:
		System.out.println("\n--- Recorrido con Visitor: hecho");
		PrintVisitor printVisitor = new PrintVisitor();
		prog.accept(printVisitor, null);

		// Que funcione lo siguiente:
		System.out.println("\n--- Compilación con Visitor: hecho");
		CompileVisitor compilevisitor = new CompileVisitor();
		prog.accept(compilevisitor, null);

	}
}
