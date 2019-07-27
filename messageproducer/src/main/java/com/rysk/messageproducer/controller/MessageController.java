package com.rysk.messageproducer.controller;

import com.rysk.messageproducer.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/send-message")
    public String sendMessage() {
        messageProducer.sendMessage();
        return "Message has been sent.";
    }
}
