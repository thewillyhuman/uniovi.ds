package io.guill.uniovi.ds.practica9.visitor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import io.guill.uniovi.ds.practica9.nodos.Asignacion;
import io.guill.uniovi.ds.practica9.nodos.ConstanteInt;
import io.guill.uniovi.ds.practica9.nodos.Division;
import io.guill.uniovi.ds.practica9.nodos.Print;
import io.guill.uniovi.ds.practica9.nodos.Producto;
import io.guill.uniovi.ds.practica9.nodos.Programa;
import io.guill.uniovi.ds.practica9.nodos.Read;
import io.guill.uniovi.ds.practica9.nodos.Sentencia;
import io.guill.uniovi.ds.practica9.nodos.Suma;
import io.guill.uniovi.ds.practica9.nodos.Variable;

public class CompileVisitor implements Visitor {

	@Override
	public Object visitAsignacion(Asignacion a, Object param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitConstanteInt(ConstanteInt ci, Object param) {
		return Integer.parseInt(ci.valor);
	}

	@Override
	public Object visitDivision(Division d, Object param) {
		return (Integer
				.parseInt(((ConstanteInt) d.left.accept(this, null)).valor)
				/ Integer.parseInt(
						((ConstanteInt) d.right.accept(this, null)).valor));
	}

	@Override
	public Object visitPrint(Print p, Object param) {
		System.out.println(p.expr.accept(this, null));
		return null;
	}

	@Override
	public Object visitProducto(Producto p, Object param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visitPrograma(Programa p, Object param) {
		for(Sentencia s : p.sentencias) {
			s.accept(this, null);
		}
		return null;
	}

	@Override
	public Object visitRead(Read e, Object param) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the " + e.var.name + ": ");
		try {
			String s = br.readLine();
			System.out.println( s );
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public Object visitSuma(Suma s, Object param) {
		return (Integer
				.parseInt(((ConstanteInt) s.left.accept(this, null)).valor)
				+ Integer.parseInt(
						((ConstanteInt) s.right.accept(this, null)).valor));
	}

	@Override
	public Object visitVariable(Variable v, Object param) {
		// TODO Auto-generated method stub
		return null;
	}

}
