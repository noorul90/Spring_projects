package com.pi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.pi.beans.Address;

public class PrimitiveTest {

	public static void main(String[] args) {

       BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/pi/common/application-context.xml"));
       Address address = factory.getBean("address" , Address.class);
       
      
       //read all class attributes
		System.out.println("addressLine1= "+address.getAddressLine1());
		System.out.println("addressLine2= "+address.getAddressLine2());
		System.out.println("street= "+address.getStreet());
		System.out.println("city= "+address.getCity());
		System.out.println("state= "+address.getState());
		System.out.println("zip= "+address.getZip());
     
       
       
	}

}
