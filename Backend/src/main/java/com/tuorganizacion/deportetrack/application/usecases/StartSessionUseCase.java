package com.tuorganizacion.deportetrack.application.usecase;

import com.tuorganizacion.deportetrack.domain.model.TrainingSession;
import com.tuorganizacion.deportetrack.domain.service.TrainingDomainService;
import com.tuorganizacion.deportetrack.port.in.StartSessionPort;
import com.tuorganizacion.deportetrack.port.out.TrainingRepositoryPort;

public class StartSessionUseCase implements StartSessionPort {
    private final TrainingDomainService domainService;
    private final TrainingRepositoryPort repository;

    public StartSessionUseCase(TrainingDomainService domainService, TrainingRepositoryPort repository) {
        this.domainService = domainService;
        this.repository = repository;
    }

    @Override
    public TrainingSession startSession(String sessionId) {
        TrainingSession session = domainService.startSession(sessionId);
        repository.save(session);
        return session;
    }
}