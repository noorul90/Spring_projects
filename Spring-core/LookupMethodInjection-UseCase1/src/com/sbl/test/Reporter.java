package com.sbl.test;

public class Reporter implements Runnable {

	@Override
	public void run() {
		ScoreBoard board=null;
		Innings inning=null;
		board = ScoreBoard.getInstance();
		for(int i=0; i<10; i++){
			inning = new Innings();
			inning.setTeamName(Thread.currentThread().getName());
			inning.setScore(i);
			board.setInning(inning);
			try {
				board.display();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
