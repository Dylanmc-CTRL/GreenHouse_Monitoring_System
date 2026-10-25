package com.greenhouse;

import com.greenhouse.model.GreenhouseZone;
import com.greenhouse.model.LightSensorData;
import com.greenhouse.model.TemperatureZone;
import java.util.Arrays;
import java.util.List;

public class GreenHouseDashboard {

    public static void main(String[] args) {
        System.out.println("Greenhouse Monitoring System");
        System.out.println();

        checkTemperatures();
        System.out.println();
        checkLight();
    }

    private static void checkTemperatures() {
        TemperatureZone zone = new TemperatureZone("Propagation Zone", 15.0, 30.0);
        List<Double> readings = Arrays.asList(18.5, 32.5, 12.0);

        System.out.println("Temperature (" + "Propagation Zone" + ")");
        for (double t : readings) {
            zone.recordReading(t);
            System.out.println(t + "°C: " + zone.evaluateTemperature(t));
        }
    }

    private static void checkLight() {
        GreenhouseZone tomatoZone = new GreenhouseZone("Tomato Zone", 5000.0);
        List<LightSensorData> readings = Arrays.asList(
                new LightSensorData("SEN-01", "Tomato Zone", 4200.0, true),
                new LightSensorData("SEN-03", "Orchid Corner", 0.0, false)
        );

        System.out.println("Light levels");
        for (LightSensorData r : readings) {
            System.out.println(r.getSensorId() + " (" + r.getAreaName() + ")");

            if (!r.isAvailable()) {
                System.out.println("  warning: no data from sensor");
                continue;
            }

            if (r.getLightLevelLux() < tomatoZone.getMinimumLightThreshold()) {
                System.out.println("  low light: " + r.getLightLevelLux() + " lux, possible shading");
            }
        }
    }
}