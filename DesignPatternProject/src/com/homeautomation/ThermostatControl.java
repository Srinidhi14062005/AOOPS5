package com.homeautomation;

public class ThermostatControl extends DeviceControl {
    public ThermostatControl(Device device) {
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
