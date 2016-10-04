package io.guill.uniovi.ds.practica_3.editor;

public interface Figura {
	public void dibujar();
	public void mover(int dx, int dy);
	public boolean contiene(int x, int y);
}
