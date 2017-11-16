package io.guill.uniovi.ds.practica8.PollKit;

public class PKQuestion {

	private int si, no;
	private String pregunta;
	private PKIUpdater[] updaters;

	public PKQuestion(String pregunta, PKIUpdater... updaters) {
		this.pregunta = pregunta;
		this.updaters = updaters;
	}

	public String getPregunta() {
		return pregunta;
	}

	public int getVotosSi() {
		return si;
	}

	public int getVotosNo() {
		return no;
	}

	public void incrementaSi() {
		si++;
		this.updateResults();
	}

	public void incrementaNo() {
		no++;
		this.updateResults();
	}

	private void updateResults() {
		for (PKIUpdater u : updaters) {
			u.update(si, no);
		}
	}

}
