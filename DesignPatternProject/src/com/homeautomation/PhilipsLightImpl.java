package com.homeautomation;

class PhilipsLightImpl implements PhilipsLight {
    private boolean isOn = false;

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Philips Light turned on.");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("Philips Light turned off.");
    }

    @Override
    public boolean getPowerStatus() {
        return isOn;
    }
}