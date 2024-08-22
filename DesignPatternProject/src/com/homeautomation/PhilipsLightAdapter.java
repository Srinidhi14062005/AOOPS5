package com.homeautomation;

public class PhilipsLightAdapter implements Device {
    private PhilipsLight philipsLight;

    public PhilipsLightAdapter(PhilipsLight philipsLight) {
        this.philipsLight = philipsLight;
    }

    @Override
    public void turnOn() {
        philipsLight.powerOn();
    }

    @Override
    public void turnOff() {
        philipsLight.powerOff();
    }

    @Override
    public boolean isOn() {
        return philipsLight.getPowerStatus();
    }
}
