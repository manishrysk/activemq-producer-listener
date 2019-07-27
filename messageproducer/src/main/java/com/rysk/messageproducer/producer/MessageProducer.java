package com.rysk.messageproducer.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MessageProducer {

    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMessage() {
        Map<String, String> message = new HashMap<>();

        message.put("sender", "from producer microservice");
        message.put("message", "abc xyz");
        this.jmsMessagingTemplate.convertAndSend("myqueue", message);
    }
}
