package com.fs.beans;

public class PDFMessageProducer implements IMessageProducer {

	@Override
	public String formatMessage(String message) {
		
		return "<PDF> " + message + " </PDF>";
	}

}
