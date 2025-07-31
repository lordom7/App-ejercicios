package com.tuorganizacion.deportetrack.adapter.out.persistence;

import com.tuorganizacion.deportetrack.domain.model.TrainingSession;
import com.tuorganizacion.deportetrack.port.out.TrainingRepositoryPort;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class TrainingRepositoryImpl implements TrainingRepositoryPort {
    private final Map<String, TrainingSession> store = new ConcurrentHashMap<>();

    @Override
    public void save(TrainingSession session) {
        store.put(session.getSessionId(), session);
    }
}
