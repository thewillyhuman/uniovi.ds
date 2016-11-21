package io.guill.uniovi.ds.practica_9.recorrerarboles;

import java.io.*;
import java.util.HashMap;

import io.guill.uniovi.ds.practica_9.contracts.Sentencia;
import io.guill.uniovi.ds.practica_9.contracts.Visitor;
import io.guill.uniovi.ds.practica_9.nodos.Asignacion;
import io.guill.uniovi.ds.practica_9.nodos.ConstanteInt;
import io.guill.uniovi.ds.practica_9.nodos.Division;
import io.guill.uniovi.ds.practica_9.nodos.Print;
import io.guill.uniovi.ds.practica_9.nodos.Producto;
import io.guill.uniovi.ds.practica_9.nodos.Programa;
import io.guill.uniovi.ds.practica_9.nodos.Read;
import io.guill.uniovi.ds.practica_9.nodos.Suma;
import io.guill.uniovi.ds.practica_9.nodos.Variable;

public class CompilerVisitor implements Visitor {
	BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
	private HashMap<String, Integer> memory = new HashMap<>();

	@Override
	public Object visit(Programa program, Object param) {
		for (Sentencia statement : program.sentencias) {
			statement.accept(this, null);
		}
		return null;
	}

	@Override
	public Object visit(Asignacion assignment, Object param) {
		int value = (int) assignment.expr.accept(this, null);
		memory.put(assignment.variable.name, value);
		return null;
	}

	@Override
	public Object visit(Read read, Object param) {
		while (true) {
			try {
				System.out.print(read.var.name + ": ");
				int value = Integer.parseInt(console.readLine());
				memory.put(read.var.name, value);
				return null;
			} catch (NumberFormatException e) {
				System.out.println("Has de introducir un valor entero");
			} catch (IOException e) {
				System.out.println("Se produjo un error al leer el valor de la variable");
			}
		}
	}

	@Override
	public Object visit(Print print, Object param) {
		System.out.println(print.expr.accept(this, null));
		return null;
	}

	@Override
	public Object visit(Suma sum, Object param) {
		int leftValue = (int) sum.left.accept(this, null);
		int rightValue = (int) sum.right.accept(this, null);
		return leftValue + rightValue;
	}

	@Override
	public Object visit(Producto product, Object param) {
		int leftValue = (int) product.left.accept(this, null);
		int rightValue = (int) product.right.accept(this, null);
		return leftValue * rightValue;
	}

	@Override
	public Object visit(Division division, Object param) {
		int leftValue = (int) division.left.accept(this, null);
		int rightValue = (int) division.right.accept(this, null);
		return leftValue / rightValue;
	}

	@Override
	public Object visit(ConstanteInt number, Object param) {
		return (int) Integer.parseInt(number.valor);
	}

	@Override
	public Object visit(Variable variable, Object param) {
		return memory.get(variable.name);
	}
}
