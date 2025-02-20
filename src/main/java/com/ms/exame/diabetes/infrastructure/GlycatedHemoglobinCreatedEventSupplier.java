package com.ms.exame.diabetes.infrastructure;

import com.ms.exame.diabetes.domain.model.Exame;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GlycatedHemoglobinCreatedEventSupplier {

    private final StreamBridge streamBridge;

    public GlycatedHemoglobinCreatedEventSupplier(StreamBridge streamBridge) {
        this.streamBridge = streamBridge;
    }

    public void sendGlycatedHemoglobinCreatedEvent(Exame exame) {
        streamBridge.send(
                "glycatedHemoglobinCreatedEventSupplier-out-0",
                MessageBuilder.withPayload(exame).build()
        );
        log.info("Glycated Hemoglobin event sent: {}", exame);
    }
}
