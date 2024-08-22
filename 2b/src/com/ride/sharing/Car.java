package com.ride.sharing;

public class Car implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Riding a car.");
    }
}
