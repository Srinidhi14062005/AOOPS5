package com.homeautomation;

public class NestThermostatAdapter implements Device {
    private NestThermostat nestThermostat;

    public NestThermostatAdapter(NestThermostat nestThermostat) {
        this.nestThermostat = nestThermostat;
    }

    @Override
    public void turnOn() {
        // Example: Just set a default temperature to turn on
        nestThermostat.setTemperature(22);
    }

    @Override
    public void turnOff() {
        // Example: No direct turn off, so you might handle it differently
    }

    @Override
    public boolean isOn() {
        return nestThermostat.getTemperature() > 0;
    }
}
