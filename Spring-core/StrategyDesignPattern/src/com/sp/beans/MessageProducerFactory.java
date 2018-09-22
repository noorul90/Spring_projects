//so far unused class

package com.sp.beans;

public class MessageProducerFactory {
	
	public static IMessageProducer createMessageProducer(String type){
		if(type.equalsIgnoreCase("html")){
			return new HTMLMessageProducer();
		}
		else if(type.equalsIgnoreCase("pdf")){
			return new PDFMessageProducer();
		}
		
		return null;
	}

}
