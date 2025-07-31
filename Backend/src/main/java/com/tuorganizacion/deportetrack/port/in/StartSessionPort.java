package com.tuorganizacion.deportetrack.port.in;

import com.tuorganizacion.deportetrack.domain.model.TrainingSession;

public interface StartSessionPort {
    TrainingSession startSession(String sessionId);
}