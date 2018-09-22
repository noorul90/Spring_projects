package com.mba.test;

import org.springframework.aop.framework.ProxyFactory;

import com.mba.beans.AuditAspect;
import com.mba.beans.LoanApprover;

public class MBATest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new LoanApprover());
		pf.addAdvice(new AuditAspect());
		LoanApprover proxy = (LoanApprover) pf.getProxy();
	    proxy.approve(452175426l);	
	}

}
