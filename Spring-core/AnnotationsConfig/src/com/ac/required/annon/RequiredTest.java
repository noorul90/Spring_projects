package com.ac.required.annon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ac/required/annon/application-context.xml");
		Person prsn = context.getBean("person", Person.class);
		System.out.println(prsn);
		
		/*BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ac/required/annon/application-context.xml"));
		BeanFactoryPostProcessor bfpp = factory.getBean("rq", BeanFactoryPostProcessor.class);		
		bfpp.postProcessBeanFactory((ConfigurableListableBeanFactory)factory);
		Person prsn = factory.getBean("person", Person.class);*/
	}

}
