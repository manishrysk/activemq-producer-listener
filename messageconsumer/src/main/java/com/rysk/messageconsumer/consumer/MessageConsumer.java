package com.rysk.messageconsumer.consumer;

import entity.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import java.util.Map;

@Component
public class MessageConsumer {

    @JmsListener(destination = "myqueue")
    public void receiveMessage(final Message message) throws JMSException {
        System.out.println("Received message in consumer" + message);
    }
}
