package com.homeautomation;

public class RemoteAccessDecorator extends DeviceDecorator {
    public RemoteAccessDecorator(Device device) {
        super(device);
    }

    public void remoteTurnOn() {
        System.out.println("Remote access: Turning on");
        turnOn();
    }

    public void remoteTurnOff() {
        System.out.println("Remote access: Turning off");
        turnOff();
    }
}
