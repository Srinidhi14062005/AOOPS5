package com.auction.system;

public interface Subject {
	 void subscribe(Observer observer);
	    void unsubscribe(Observer observer);
	    void notifyObservers(String event);
}
