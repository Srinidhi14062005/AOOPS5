package com.homeautomation;

public abstract class DeviceDecorator implements Device {
	
	    protected Device decoratedDevice;

	    public DeviceDecorator(Device device) {
	        this.decoratedDevice = device;
	    }

	    @Override
	    public void turnOn() {
	        decoratedDevice.turnOn();
	    }

	    @Override
	    public void turnOff() {
	        decoratedDevice.turnOff();
	    }

	    @Override
	    public boolean isOn() {
	        return decoratedDevice.isOn();
	    }
	}

	


