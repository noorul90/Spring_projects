package com.ara.beans;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class OffersAspect implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method method, Object[] args,
			Object target) throws Throwable {

		Double billAmt = null;
		MembershipCard card = null;
		billAmt = (Double) retVal;
		card = (MembershipCard) args[1];
		if (billAmt >= 1000 && card.getType().equals("platinum")) {
			System.out
					.println("congratulation...!! you have been entitled for a discount of 30% in your next purchase. Here is the Coupon No: CP30, Have a nice day");
		} else if (billAmt >= 2000 && card.getType().equals("gold")) {
			System.out
					.println("congratulation...!! you have been entitled for a discount of 20% in your next purchase. Here is the coupon no: CP20, Have a nice day");
		}
	}

}
