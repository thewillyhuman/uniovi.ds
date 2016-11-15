package io.guill.uniovi.ds.practica_9.contracts;

import io.guill.uniovi.ds.practica_9.nodos.*;

public interface Visitor {
	Object visit(Asignacion a, Object param);
	Object visit(ConstanteInt c, Object param);
	Object visit(Division d, Object param);
	Object visit(Print p, Object param);
	Object visit(Producto p, Object param);
	Object visit(Programa p, Object param);
	Object visit(Read r, Object param);
	Object visit(Suma s, Object param);
	Object visit(Variable v, Object param);
}
