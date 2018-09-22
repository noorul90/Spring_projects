package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mba.beans.LoanApprover;

public class MBAtest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mba/common/application-context.xml");
		LoanApprover proxy = context.getBean("loanApprover", LoanApprover.class);
		System.out.println("status: "+proxy.approveLoan(1254632));
	}

}