package io.guill.uniovi.ds.practica_8.graficos;

public class GraficoContador implements Grafico{
	
	Grafico grafico;
	int nVotos;
	
	public GraficoContador(Grafico grafico, int nVotos){
		this.grafico = grafico;
		this.nVotos = nVotos;
	}
	
	@Override
	public void update(int si, int no) {
		if (si+no >= nVotos)
			grafico.update(si, no);
	}
}
