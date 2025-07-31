package com.tuorganizacion.deportetrack.adapter.in.websocket;

import com.tuorganizacion.deportetrack.application.usecase.StartSessionUseCase;
import com.tuorganizacion.deportetrack.domain.model.TrainingSession;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class TrainingWebSocketController {
    private final StartSessionUseCase startUseCase;

    public TrainingWebSocketController(StartSessionUseCase startUseCase) {
        this.startUseCase = startUseCase;
    }

    @MessageMapping("/start-session")
    @SendTo("/topic/session-started")
    public TrainingSession startSession(String sessionId) {
        return startUseCase.startSession(sessionId);
    }
}
