package edu.mum.asd.lab5.entity;

public interface Subject {

	public void registerCreatedObserver(Observer o);
	public void registerUpdatedObserver(Observer o);
	
	
	public void removeCreatedObserver(Observer o);
	public void removeUpdatedObserver(Observer o);
	
	public void notifyCreatedObservers();
	public void notifyUpdatedObservers();
	
	
	
	
	
}
