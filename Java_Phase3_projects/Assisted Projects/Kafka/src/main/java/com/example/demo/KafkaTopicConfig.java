package com.example.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
//@Bean use at the top of method which return object and always use with @Configuration
    @Bean
    public NewTopic javaguidesTopic(){
    	//TopicBuilder is a predefined class . we are setting here name of the topic and build objcet with the help of build()
        return TopicBuilder.name("javaguides")
                .build();
    }
}