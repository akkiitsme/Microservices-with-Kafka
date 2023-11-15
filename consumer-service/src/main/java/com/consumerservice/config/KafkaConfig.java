package com.consumerservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    @KafkaListener(topics = AppConstant.LOCATION_TOPIC_NAME,groupId = AppConstant.GROUP_ID)
    public void updatedLocation(String value){
        System.out.println("Message Consuming....!! : "+value);
        // We can save Value into database
    }
}
