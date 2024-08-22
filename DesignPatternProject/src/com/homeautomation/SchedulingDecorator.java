package com.homeautomation;

public class SchedulingDecorator extends DeviceDecorator {
    public SchedulingDecorator(Device device) {
        super(device);
    }

    public void scheduleOn(String time) {
        // Implement scheduling logic
        System.out.println("Scheduled to turn on at " + time);
    }

    public void scheduleOff(String time) {
        // Implement scheduling logic
        System.out.println("Scheduled to turn off at " + time);
    }
}
