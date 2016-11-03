package org.lab02.observer;

import org.lab02.service.Subject;

public class SmsSender implements ObserverAccountModification  {

	@Override
	public void NotifyAccountChanged() {
		System.out.println("Sms => Changing Happened :D !");
		
	}
	public SmsSender(Subject observalbleObject){
		observalbleObject.registerObserverChanging(this);
		
	}

	

}
