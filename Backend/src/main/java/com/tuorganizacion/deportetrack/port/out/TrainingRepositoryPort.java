package com.tuorganizacion.deportetrack.port.out;

import com.tuorganizacion.deportetrack.domain.model.TrainingSession;

public interface TrainingRepositoryPort {
    void save(TrainingSession session);
}