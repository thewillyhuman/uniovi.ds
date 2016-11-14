package io.guill.uniovi.ds.practica_8.graficos;

public class GraficoEstadoVotacion implements Grafico{

	@Override
	public void update(int si, int no) {
		System.out.println("VOTOS SI: " + si);
		System.out.println("VOTOS NO: " + no);
	}

}
