package com.fswh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fswh.dao.BusDao;
import com.fswh.entities.Bus;

public class FSWHTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fswh/common/application-context.xml");
		BusDao busDao = context.getBean("busDao", BusDao.class);
		Bus bus = new Bus();
		bus.setServiceNo("SRV506070");
		bus.setRegNo("TS7748552HYD13");
		bus.setBusType("AC");
		bus.setSeatingCapacity(35);
		
		System.out.println("BusID: " + busDao.saveBus(bus));
	
	}

}
