package com.homeautomation;

public abstract class DeviceControl implements Device {
	protected Device device;

    public DeviceControl(Device device) {
        this.device = device;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract boolean isOn();
}
