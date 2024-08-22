package com.homeautomation;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LightControlTest {

    private Device philipsLight;
    private LightControl lightControl;

    @Before
    public void setUp() {
        philipsLight = new PhilipsLightAdapter(new PhilipsLightImpl());
        lightControl = new LightControl(philipsLight);
    }

    @Test
    public void testTurnOn() {
        lightControl.turnOn();
        assertTrue(lightControl.isOn());
    }

    @Test
    public void testTurnOff() {
        lightControl.turnOn();
        lightControl.turnOff();
        assertFalse(lightControl.isOn());
    }
}
