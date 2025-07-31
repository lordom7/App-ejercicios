package com.tuorganizacion.deportetrack.domain.model;

import java.time.Instant;

public class TrainingSession {
    private String sessionId;
    private Instant startTime;
    private Instant endTime;
    private double distanceKm;
    private double calories;

    public TrainingSession(String sessionId, Instant startTime) {
        this.sessionId = sessionId;
        this.startTime = startTime;
    }

    public String getSessionId() { return sessionId; }
    public Instant getStartTime() { return startTime; }
    public Instant getEndTime() { return endTime; }
    public void setEndTime(Instant endTime) { this.endTime = endTime; }
    public double getDistanceKm() { return distanceKm; }
    public void setDistanceKm(double distanceKm) { this.distanceKm = distanceKm; }
    public double getCalories() { return calories; }
    public void setCalories(double calories) { this.calories = calories; }
}
