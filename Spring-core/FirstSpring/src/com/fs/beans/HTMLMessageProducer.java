package com.fs.beans;

public class HTMLMessageProducer implements IMessageProducer {

	@Override
	public String formatMessage(String message) {
		
		return "<HTML> " + message + " </HTML>";
	}

}
