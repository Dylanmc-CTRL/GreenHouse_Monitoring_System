package com.greenhouse.model;

import java.util.ArrayList;
import java.util.List;

public class TemperatureZone {
    private String zoneName;
    private double minThreshold;
    private double maxThreshold;
    private List<Double> temperatureHistory;

    public TemperatureZone(String zoneName, double minThreshold, double maxThreshold) {
        this.zoneName = zoneName;
        this.minThreshold = minThreshold;
        this.maxThreshold = maxThreshold;
        this.temperatureHistory = new ArrayList<>();
    }

    public void recordReading(double temp) { temperatureHistory.add(temp); }
    
    public String evaluateTemperature(double currentTemp) {
        if (currentTemp > maxThreshold) return "TOO HOT (Exceeds max limit)";
        if (currentTemp < minThreshold) return "TOO COLD (Below min limit)";
        return "OPTIMAL";
    }

    public String getZoneName() { return zoneName; }
    public double getMinThreshold() { return minThreshold; }
    public double getMaxThreshold() { return maxThreshold; }
    public List<Double> getTemperatureHistory() { return temperatureHistory; }
}