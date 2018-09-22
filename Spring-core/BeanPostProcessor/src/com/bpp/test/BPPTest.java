package com.bpp.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.bpp.beans.EditEmployeeController;

public class BPPTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource(
				"com/bpp/common/application-context.xml"));
		BeanPostProcessor bpp = factory.getBean("valueObjectBeanPostProcessor",
				BeanPostProcessor.class);
		((ConfigurableListableBeanFactory) factory).addBeanPostProcessor(bpp);
		EditEmployeeController eec = factory.getBean("editEmployeeController",
				EditEmployeeController.class);
		eec.editEmployee(101, "George", "X", 210000f);

	}

}
