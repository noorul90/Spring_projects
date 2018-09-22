package com.sbl.test;

public class ScoreBoard {
	private static ScoreBoard instance;
	private Innings inning;
	
	
	public Innings getInning() {
		return inning;
	}
	public void setInning(Innings inning) {
		this.inning = inning;
	}
	private ScoreBoard() {
		//no-op
	}
	public static synchronized ScoreBoard getInstance(){
		if(instance==null){
			instance = new ScoreBoard();
		}
		return instance;
	}
	
	public void display() throws InterruptedException{
		System.out.println("Team: "+inning.getTeamName());
		Thread.sleep(1000);
		System.out.println("Score: "+inning.getTeamName()+"-"+inning.getScore());
	}
	
}
