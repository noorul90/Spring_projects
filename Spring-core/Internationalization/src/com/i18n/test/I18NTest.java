package com.i18n.test;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18NTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/i18n/common/application-context.xml");
		
		//String message = context.getMessage("index.title", new Object[]{}, Locale.getDefault());
		//String message = context.getMessage("user.incorrect", new Object[]{}, Locale.getDefault());
		//String message = context.getMessage("user.incorrect", new Object[]{}, Locale.CANADA_FRENCH);
		//String message = context.getMessage("uer.incorrect", new Object[]{}, "No message found or key should be incorrect", Locale.getDefault());
		//String message = context.getMessage("field.incorrect", new Object[]{"lastname"}, Locale.getDefault());
		//String message = context.getMessage("field.incorrect", new Object[]{"firstname"}, Locale.CANADA_FRENCH);
		//String message = context.getMessage("fld.incorrect", new Object[]{"middlename"}, Locale.getDefault());
		//String message = context.getMessage("field.incorrect", new Object[]{"firstname"}, "No Message Found", Locale.getDefault());
		//String message = context.getMessage("fie.incorrect", new Object[]{"lastname"}, "No Message Found", Locale.CANADA_FRENCH);
		//String message = context.getMessage("field.incorrect", new Object[]{"firstname"}, "No Message Found", Locale.getDefault());
		//String message = context.getMessage("age.incorrect", new Object[]{"age"}, "No Message Found", Locale.getDefault());
		//String message = context.getMessage("a.incorrect", new Object[]{"xyz"}, "Message not Found", Locale.getDefault());
		String message = context.getMessage("age.incorrect", new Object[]{"age"}, "No Message Found", Locale.CANADA_FRENCH);
		
		System.out.println(message);
		
		/*System.out.println("France locale: "+Locale.FRANCE);
		System.out.println("French locale: "+Locale.FRENCH);
		System.out.println("canada locale: "+Locale.CANADA_FRENCH);
		
		Locale locale = Locale.getDefault();
		System.out.println("current Locale: "+locale);*/
	}

}
