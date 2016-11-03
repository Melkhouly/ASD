package org.lab02.service;

import org.lab02.observer.ObserverAccountCreation;
import org.lab02.observer.ObserverAccountModification;

public interface Subject {
	
	public void registerObserverCreation(ObserverAccountCreation observer);
	public void removeObserverCreation(ObserverAccountCreation observer);
	public void notifyObserversCreation();
	
	public void registerObserverChanging(ObserverAccountModification observer);
	public void removeObserverChanging(ObserverAccountModification observer);
	public void notifyObserversChanging();

}
