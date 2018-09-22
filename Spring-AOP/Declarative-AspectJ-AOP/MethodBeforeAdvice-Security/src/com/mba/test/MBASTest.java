package com.mba.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mba.beans.LoanApprover;
import com.mba.util.AuthenticationManager;

public class MBASTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/mba/common/application-context.xml");
		LoanApprover proxy = context.getBean("loanApprover",LoanApprover.class);
		AuthenticationManager amgr = context.getBean("authenticationManager",AuthenticationManager.class);
		amgr.login("John", "welcome");
		System.out.println("loan status: " +proxy.approveLoan(2541365214l,30000));
	}

}