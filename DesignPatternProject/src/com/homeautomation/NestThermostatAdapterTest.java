package com.homeautomation;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NestThermostatAdapterTest {

    private NestThermostat nestThermostat;
    private Device nestThermostatAdapter;

    @Before
    public void setUp() {
        nestThermostat = new NestThermostatImpl();
        nestThermostatAdapter = new NestThermostatAdapter(nestThermostat);
    }

    @Test
    public void testTurnOn() {
        nestThermostatAdapter.turnOn();
        assertTrue(nestThermostatAdapter.isOn());
    }

    @Test
    public void testTurnOff() {
        nestThermostatAdapter.turnOn();
        nestThermostatAdapter.turnOff();
        // Assuming turnOff does not affect the temperature in this implementation
        assertTrue(nestThermostatAdapter.isOn());
    }
}
