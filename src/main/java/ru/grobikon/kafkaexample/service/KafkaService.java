package ru.grobikon.kafkaexample.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.grobikon.kafkaexample.message.MessageKafka;

@Service
@RequiredArgsConstructor
@Transactional
public class KafkaService {

    private final KafkaTemplate<String, MessageKafka> kafkaTemplate;

    public void sendMessageKafka() {
        kafkaTemplate.send("notificationTopic", MessageKafka.builder().message("Test Grobikon").build());
    }
}
