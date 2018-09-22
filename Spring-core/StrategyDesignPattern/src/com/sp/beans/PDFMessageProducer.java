package com.sp.beans;

public class PDFMessageProducer implements IMessageProducer {

	@Override
	public String formatMessage(String message) {
		
		return "PDF format " +message+ "!";
	}

}
