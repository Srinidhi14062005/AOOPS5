package com.homeautomation;

public class LightControl extends DeviceControl {
    public LightControl(Device device) {
        super(device);
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    @Override
    public boolean isOn() {
        return device.isOn();
    }
}

