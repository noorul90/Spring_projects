package com.ca.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ca.dao.StudentDao;

public class ClassicApproachTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ca/common/application-context.xml");
		StudentDao sdao = context.getBean("studentDao", StudentDao.class);
		System.out.println("student: "+sdao.getAllStudent());
	}

}
