package com.tuorganizacion.deportetrack.domain.service;

import com.tuorganizacion.deportetrack.domain.model.TrainingSession;
import java.time.Instant;

public class TrainingDomainService {
    public TrainingSession startSession(String sessionId) {
        return new TrainingSession(sessionId, Instant.now());
    }

    public TrainingSession endSession(TrainingSession session, double distanceKm, double calories) {
        session.setEndTime(Instant.now());
        session.setDistanceKm(distanceKm);
        session.setCalories(calories);
        return session;
    }
}