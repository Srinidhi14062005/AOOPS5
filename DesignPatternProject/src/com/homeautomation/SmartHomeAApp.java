package com.homeautomation;

public class SmartHomeAApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Adapting existing devices
        PhilipsLight philipsLight = new PhilipsLightImpl();
        Device philipsLightDevice = new PhilipsLightAdapter(philipsLight);

        NestThermostat nestThermostat = new NestThermostatImpl();
        Device nestThermostatDevice = new NestThermostatAdapter(nestThermostat);

        // Using Bridge pattern
        DeviceControl lightControl = new LightControl(philipsLightDevice);
        DeviceControl thermostatControl = new ThermostatControl(nestThermostatDevice);

        // Adding features with Decorator pattern
        Device scheduledLight = new SchedulingDecorator(lightControl);
        Device remoteThermostat = new RemoteAccessDecorator((Device) thermostatControl);

        // Interacting with the devices
        scheduledLight.turnOn();
        ((SchedulingDecorator) scheduledLight).scheduleOff("22:00");

        ((RemoteAccessDecorator) remoteThermostat).remoteTurnOn();
	}

}
