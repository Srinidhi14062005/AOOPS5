package com.ride.sharing;

public class Bike implements Vehicle {
    @Override
    public void ride() {
        System.out.println("Riding a bike.");
    }
}