package io.guill.uniovi.ds.practica9.visitor;

import io.guill.uniovi.ds.practica9.nodos.*;

public interface Visitor {

	/**
	 * Performs the sentence.
	 * 
	 * @param a is the sentence to execute.
	 */
	Object visitAsignacion(Asignacion a, Object param);
	
	/**
	 * Performs the sentence.
	 * 
	 * @param ci
	 */
	Object visitConstanteInt(ConstanteInt ci, Object param);
	
	/**
	 * Performs the sentence.
	 * 
	 * @param d
	 */
	Object visitDivision(Division d, Object param);
	
	/**
	 * Performs the sentence.
	 * 
	 * @param p
	 */
	Object visitPrint(Print p, Object param);
	
	/**
	 * Performs the sentence.
	 * 
	 * @param p
	 */
	Object visitProducto(Producto p, Object param);
	
	/**
	 * Performs the sentence.
	 * 
	 * @param p
	 */
	Object visitPrograma(Programa p, Object param);
	
	/**
	 * Performs the sentence.
	 * 
	 * @param e
	 */
	Object visitRead(Read e, Object param);
	
	/**
	 * Performs the sentence.
	 * 
	 * @param s
	 */
	Object visitSuma(Suma s, Object param);
	
	/**
	 * Performs the sentence.
	 * 
	 * @param v
	 */
	Object visitVariable(Variable v, Object param);
}
