package com.auction.system;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String item;
    private boolean isStarted;
    private boolean isEnded;

    public Auction(String item) {
        this.item = item;
        this.isStarted = false;
        this.isEnded = false;
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void startAuction() {
        this.isStarted = true;
        notifyObservers("Auction for item " + item + " has started.");
    }

    public void endAuction() {
        this.isEnded = true;
        notifyObservers("Auction for item " + item + " has ended.");
    }

    public void itemAvailable() {
        notifyObservers("Item " + item + " is now available for auction.");
    }
}
