package com.sp.beans;

public class MessageWriter {
	
	private IMessageProducer messageProducer;
	public void writeMessage(String message){
		
		//instantiate messageProducer with concrete implementation class
		String writeData = messageProducer.formatMessage(message);
		System.out.println(writeData);
		
	}
	
	//create setter
	public void setMessageProducer(IMessageProducer messageProducer){
		this.messageProducer = messageProducer;
		
	}

}
