package com.example.rabbitmq.Controller;

import com.example.rabbitmq.Producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private MessageProducer producer;

    @GetMapping("/send")
    public String send(){
        producer.send("Hello RabbitMQ");
        return "Message sent";
    }
}
