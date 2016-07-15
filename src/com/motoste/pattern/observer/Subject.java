package com.motoste.pattern.observer;

public interface Subject {

	public void addObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObservers(Subject sub, Object obj);
	
	public boolean isChanged();
	
}
