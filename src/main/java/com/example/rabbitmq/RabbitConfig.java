package com.example.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

public class RabbitConfig{
    // Create Queue config
    @Bean
    public Queue queue(){
        return new Queue("queue",false);
    }
}