package com.sbl.test;

public class Test {

	public static void main(String[] args) {
		Reporter reporter = new Reporter();
		Thread team1 = new Thread(reporter, "India");
		Thread team2 = new Thread(reporter, "Pakistan");
		team1.start();
		team2.start();
	}

}
