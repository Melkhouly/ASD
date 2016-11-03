package org.lab02.observer;

import org.lab02.service.Subject;

public class Logger implements ObserverAccountCreation {

	@Override
	public void updateCreation() {
		System.out.println("Update send to Logger");

	}

	public Logger(Subject observalbleObject) {
		observalbleObject.registerObserverCreation(this);
	}

}
