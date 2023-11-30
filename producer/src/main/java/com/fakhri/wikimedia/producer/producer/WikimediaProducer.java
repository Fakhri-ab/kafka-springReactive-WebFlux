package com.fakhri.wikimedia.producer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
@RequiredArgsConstructor // est une annotation de projet Lombok qui génère automatiquement un constructeur avec les champs final et @NonNull
@Slf4j
// classe pour envoyer un topic a notre apache kafka server
public class WikimediaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg) {
        // log.info(format("Sending message to Fakhri Topic:: %s", msg));
        kafkaTemplate.send("wikimedia-stream", msg);
    }
}
