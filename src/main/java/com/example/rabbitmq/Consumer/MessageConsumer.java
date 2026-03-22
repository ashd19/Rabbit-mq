package com.example.rabbitmq.Consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class MessageConsumer{
    // springboot automatically listens to the queue
    @RabbitListener(queues = "testQueue")
    public void receiveMessage(String message){
        System.out.println("Received : " + message);
    }
}