package edu.mum.asd.lab5.entity;

public class EmailSender implements Observer {

	@Override
	public void update(String message) {
		System.out.println(message+" message from EmailSender Class");

	}

}
