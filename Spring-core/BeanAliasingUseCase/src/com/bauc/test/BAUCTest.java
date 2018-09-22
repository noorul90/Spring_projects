package com.bauc.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bauc.beans.Address;
import com.bauc.beans.FlipKartStore;
import com.bauc.beans.Payment;

public class BAUCTest {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("Samsung");
		list.add("Nokia");
		list.add("Sony");

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/bauc/common/application-context.xml"));
		Address add = factory.getBean("address" , Address.class);
		Payment pay = factory.getBean("payment" , Payment.class);
		FlipKartStore fk = factory.getBean("flipkartStore" , FlipKartStore.class);
		fk.checkOut(list, add, pay);
		

	}

}
