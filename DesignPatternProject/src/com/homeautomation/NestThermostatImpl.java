package com.homeautomation;

class NestThermostatImpl implements NestThermostat {
    private int temperature = 0;

    @Override
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Nest Thermostat set to " + temperature + "°C.");
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}
