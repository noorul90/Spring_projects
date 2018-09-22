package com.sp.beans;

public class MessageTest {

	public static void main(String[] args) {

       MessageWriter mw = new MessageWriter();
       IMessageProducer messageProducer = new HTMLMessageProducer();
       mw.setMessageProducer(messageProducer);
       mw.writeMessage("Welcome to Strategy Design pattern");

	}

}
