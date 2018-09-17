package com.sjt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sjt.bo.StudentBO;
import com.sjt.dao.StudentInsertDao;

public class SJITest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sjt/common/application-context.xml");
		StudentInsertDao siDao = context.getBean("studentInsertDao", StudentInsertDao.class);
		StudentBO bo = new StudentBO(11, "Sugreeva", 11665522, "sugreeva@rama.com");
		System.out.println("record inserted: " +siDao.saveStudent(bo));
	}

}
