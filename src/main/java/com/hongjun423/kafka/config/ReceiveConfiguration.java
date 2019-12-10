package com.hongjun423.kafka.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ReceiveConfiguration {

    @KafkaListener(topics = "topic-test1", groupId = "console-consumer-1970")
    public void receive(String payload) {
        log.info("received payload='{}'", payload);
    }
}
