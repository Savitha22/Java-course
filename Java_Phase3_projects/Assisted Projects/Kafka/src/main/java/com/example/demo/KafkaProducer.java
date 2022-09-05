package com.example.demo;


import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
//Logger is a predefined interface which helps to store execution plan of a project
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
//kafkatemplate provide DI and autoconfiguration facility
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        //LOGGER.info(String.format("Message sent -> %s", message));
       LOGGER.info("Message sent-> "+message);
       //call send method to send topic and message
       kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
    }
}