package com.greenhouse.model;

import java.time.LocalDateTime;

public class LightSensorData {
    private String sensorId;
    private String areaName;
    private double lightLevelLux;
    private LocalDateTime timestamp;
    private boolean isAvailable;

    public LightSensorData(String sensorId, String areaName, double lightLevelLux, boolean isAvailable) {
        this.sensorId = sensorId;
        this.areaName = areaName;
        this.lightLevelLux = lightLevelLux;
        this.timestamp = LocalDateTime.now();
        this.isAvailable = isAvailable;
    }

    public String getSensorId() { return sensorId; }
    public String getAreaName() { return areaName; }
    public double getLightLevelLux() { return lightLevelLux; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public boolean isAvailable() { return isAvailable; }
}