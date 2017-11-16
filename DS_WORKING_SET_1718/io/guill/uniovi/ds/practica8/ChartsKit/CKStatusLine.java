package io.guill.uniovi.ds.practica8.ChartsKit;

import io.guill.uniovi.ds.practica8.PollKit.PKIUpdater;

public class CKStatusLine implements PKIUpdater {

	@Override
	public void update(int yesVotes, int noVotes) {
		System.out.println("Nº of yes votes = " + yesVotes + ". Nº of no = " + noVotes);
	}

}
