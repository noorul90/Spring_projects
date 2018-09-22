package com.fs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fs.beans.IMessageProducer;
import com.fs.beans.MessageWriter;

public class MessageTest {

	public static void main(String[] args) {

       BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/fs/common/application-context.xml"));
       
       //MessageWriter mw = (MessageWriter) factory.getBean("messageWriter");  ===> OR use Generics like the following to avoid typeCasting
       MessageWriter mw = factory.getBean("messageWriter", MessageWriter.class);
      
       // IMessageProducer messageProducer = factory.getBean("htmlMessageProducer", IMessageProducer.class);
       //mw.setMessageProducer(messageProducer);
      
       mw.writeMessage("Welcome to Spring");

	}

}
