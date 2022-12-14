package ru.grobikon.kafkaexample.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.grobikon.kafkaexample.message.MessageKafka;

@Component
@Slf4j
public class ConsumerKafka {


    @KafkaListener(topics = "notificationTopic")
    public void handleNotification(MessageKafka messageKafka) {
        //комментарий
        log.debug("Получили сообщение текст из main messageKafka: {}", messageKafka);
        System.out.println("Получили сообщение messageKafka: " + messageKafka);
    }
}
