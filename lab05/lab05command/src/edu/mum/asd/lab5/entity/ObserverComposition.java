package edu.mum.asd.lab5.entity;

import java.util.ArrayList;
import java.util.List;

public class ObserverComposition implements Subject {

	
	List<Observer> createdObserversList = new ArrayList<Observer>();
	List<Observer> updatedObserversList = new ArrayList<Observer>();

	
	@Override
	public void registerCreatedObserver(Observer o) {
		createdObserversList.add(o);
		
	}

	@Override
	public void registerUpdatedObserver(Observer o) {
		updatedObserversList.add(o);
		
	}

	@Override
	public void removeCreatedObserver(Observer o) {
		createdObserversList.remove(o);
	}

	@Override
	public void removeUpdatedObserver(Observer o) {
		updatedObserversList.remove(o);
		
	}

	@Override
	public void notifyCreatedObservers() {
		for(Observer o: createdObserversList){
			o.update("Account has been created");
		}
		
	}

	@Override
	public void notifyUpdatedObservers() {
		for(Observer o: updatedObserversList){
			o.update("Account balance has been changed");
		}
	}

	
	
	
	
}
