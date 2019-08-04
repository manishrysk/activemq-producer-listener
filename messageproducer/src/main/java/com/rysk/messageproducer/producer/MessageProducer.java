package com.rysk.messageproducer.producer;

import entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void sendMessage() {
        Message message = new Message("John", "Hello mate!");
        this.jmsMessagingTemplate.convertAndSend("myqueue", message);
    }
}
