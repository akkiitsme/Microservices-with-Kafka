package com.producerservice.controller;

import com.producerservice.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LocationController {

    @Autowired
    KafkaService kafkaService;

    @GetMapping("/update-track")
    public ResponseEntity<?> updateLocation(){
        this.kafkaService.updateLocation("("+Math.round(Math.random()*100)+","+Math.round(Math.random()*100)+")");
        return new ResponseEntity<>("Location Updated SuccessFully !!" , HttpStatus.ACCEPTED);
    }
}
