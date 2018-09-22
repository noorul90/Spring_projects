package com.mba.beans;

public class LoanApprover {
	public boolean approveLoan(long loanNo, int loanAmt){
		if(loanAmt<=25000){
			System.out.println("your loan intrest is 12.25%");
		}
		else{
			System.out.println("your loan intrest is 11.22%");
		}
		return true;
	}

}
