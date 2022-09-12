package ru.grobikon.kafkaexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.grobikon.kafkaexample.service.KafkaService;

@RestController
@RequiredArgsConstructor
public class ControllerKafka {

    private final KafkaService kafkaService;

    @GetMapping("/send-message")
    public void send() {
        kafkaService.sendMessageKafka();
    }
}
