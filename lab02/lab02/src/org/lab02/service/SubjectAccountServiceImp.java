package org.lab02.service;

import java.util.ArrayList;
import java.util.List;

import org.lab02.observer.ObserverAccountCreation;
import org.lab02.observer.ObserverAccountModification;

public class SubjectAccountServiceImp implements Subject {

	List<ObserverAccountCreation> observerList;
	List<ObserverAccountModification> observerChangingList;
	
	public SubjectAccountServiceImp(){
		observerList= new ArrayList<>();
		observerChangingList= new ArrayList<>();
	}
	
	@Override
	public void registerObserverCreation(ObserverAccountCreation observer) {
		observerList.add(observer);


	}

	@Override
	public void removeObserverCreation(ObserverAccountCreation observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifyObserversCreation() {
	for(ObserverAccountCreation o :observerList){
		o.updateCreation();
	}

	}

	@Override
	public void registerObserverChanging(ObserverAccountModification observer) {
		observerChangingList.add(observer);
		
	}

	@Override
	public void removeObserverChanging(ObserverAccountModification observer) {
		observerChangingList.remove(observer);
		
	}

	@Override
	public void notifyObserversChanging() {
		for(ObserverAccountModification o :observerChangingList){
			o.NotifyAccountChanged();
		}

		
	}



}
