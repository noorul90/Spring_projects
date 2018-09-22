package com.ara.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.framework.ProxyFactory;

import com.ara.beans.BillGenerator;
import com.ara.beans.MembershipCard;
import com.ara.beans.OffersAspect;

public class ARATest {
	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new BillGenerator());
		pf.addAdvice(new OffersAspect());
		
		List<String> prodCode = new ArrayList<String>();
		prodCode.add("LCD230152");
		prodCode.add("HP253145");
		
		MembershipCard card = new MembershipCard();
		card.setCardNumber("DL1254IN");
		card.setType("gold");
		
		BillGenerator proxy = (BillGenerator)pf.getProxy();
		System.out.println("Generated bill amount: " + proxy.generateBill(prodCode, card));
	}

}
