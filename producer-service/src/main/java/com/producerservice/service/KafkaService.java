package com.producerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import static com.producerservice.config.AppConstant.LOCATION_TOPIC_NAME;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public boolean updateLocation(String location){
        this.kafkaTemplate.send(LOCATION_TOPIC_NAME ,location);
        System.out.println(LOCATION_TOPIC_NAME+" : "+ location);
        return true;
    }
}
