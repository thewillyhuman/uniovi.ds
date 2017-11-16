package io.guill.uniovi.ds.practica8.ChartsKit;

import io.guill.uniovi.ds.practica8.PollKit.PKIUpdater;

public class CKComposedChart implements PKIUpdater {
	
	private PKIUpdater updater;
	private int initialStart, step, processed = 0;
	
	public CKComposedChart(PKIUpdater updater, int initialStart, int step) {
		this.updater = updater;
		this.initialStart = initialStart;
		this.step = step;
	}

	@Override
	public void update(int yesVotes, int noVotes) {
		if((yesVotes + noVotes) >= (initialStart-1)) {
			this.processed++;
			if(step == processed) {
				this.updater.update(yesVotes, noVotes);
				this.processed = 0;
			}
		}
	}

}
