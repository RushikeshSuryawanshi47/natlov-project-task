package com.kafkaSpring.Task2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.kafkaSpring.Task2.entity.User;
import com.kafkaSpring.Task2.userRepository.UserRepository;

@Service
public class KafkaConsumer {

    /*@KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }*/
	@Autowired
	private UserRepository userRepository;

    @KafkaListener(topics = "kafka-spring-producer", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
    public void listenWithHeaders(
            @Payload User message   )
           // @Header(KafkaHeaders.R) int partition) 
     {
    	userRepository.save(message);
    	
        System.out.println("Received Message: \n" + message );
    }
}
