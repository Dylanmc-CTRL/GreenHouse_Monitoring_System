package com.greenhouse.model;

import java.util.ArrayList;
import java.util.List;

public class GreenhouseZone {
    private String areaName;
    private double minimumLightThreshold;
    private List<Double> lightHistory;

    public GreenhouseZone(String areaName, double minimumLightThreshold) {
        this.areaName = areaName;
        this.minimumLightThreshold = minimumLightThreshold;
        this.lightHistory = new ArrayList<>();
    }

    public void addReading(double lux) { lightHistory.add(lux); }
    public String getAreaName() { return areaName; }
    public double getMinimumLightThreshold() { return minimumLightThreshold; }
}