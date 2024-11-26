package com.delieveryBoy.controller;

import com.delieveryBoy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {


    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(){

     sum(3,5);
        for(int i=1;i<=10000;i++) {
            this.kafkaService.updateLocation("(" + Math.round(Math.random() * 100) + " ," + Math.round(Math.random() * 100) + " )");
        }
        return  new ResponseEntity<>(Map.of("message","locatio updated"), HttpStatus.OK);
    }

    private void sum(int a,int b)
    {

        System.out.print(a+b);
    }
}
