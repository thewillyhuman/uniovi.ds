package io.guill.uniovi.ds.practica8.PollKit;

@FunctionalInterface
public interface PKIUpdater {
	
	/**
	 * 
	 * @param yesVotes are the yes votes.
	 * @param noVotes are the no votes.
	 */
	public void update(int yesVotes, int noVotes);

}
