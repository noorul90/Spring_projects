package com.npjt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.npjt.bo.StudentBO;
import com.npjt.dao.StudentDao;

public class NPJTTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/npjt/common/application-context.xml");
		StudentDao dao = context.getBean("studentDao", StudentDao.class);
		//System.out.println("student count: "+dao.getNoOfStudentsInACourse("java"));
		//System.out.println("students count1 : " + dao.findStudentsById(1));
		//System.out.println("student count2 : " + dao.findStudentById(2));
		//System.out.println("students: "+dao.getStudentByName("%a%"));
		
		/*StudentBO sbo = new StudentBO();
		sbo.setId(3);
		sbo.setName("laksmana");
		sbo.setEmail("abc@lanka.com");
		sbo.setMobile(5236251);*/
		StudentBO sbo = new StudentBO(3, "Akash", 99889988, "akash@se.com");
		System.out.println("update: "+dao.updateStudent(sbo));
	}

}
