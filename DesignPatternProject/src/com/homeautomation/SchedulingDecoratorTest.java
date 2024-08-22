package com.homeautomation;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SchedulingDecoratorTest {

    private Device philipsLight;
    private Device scheduledLight;

    @Before
    public void setUp() {
        philipsLight = new PhilipsLightAdapter(new PhilipsLightImpl());
        scheduledLight = new SchedulingDecorator(new LightControl(philipsLight));
    }

    @Test
    public void testScheduleOn() {
        ((SchedulingDecorator) scheduledLight).scheduleOn("06:00");
        // You might check logs or state if scheduling logic was implemented
        assertTrue(scheduledLight.isOn());
    }

    @Test
    public void testScheduleOff() {
        ((SchedulingDecorator) scheduledLight).scheduleOff("22:00");
        // Check the scheduled status or verify that the device turned off
        assertFalse(scheduledLight.isOn());
    }
}
