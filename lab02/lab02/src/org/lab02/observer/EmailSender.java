package org.lab02.observer;

import org.lab02.service.Subject;

public class EmailSender implements ObserverAccountCreation {

	@Override
	public void updateCreation() {
		System.out.println("Update Send to Email Server");
		
	}
	
	public EmailSender(Subject observalbleObject ){
		observalbleObject.registerObserverCreation(this);
		
	}



}
