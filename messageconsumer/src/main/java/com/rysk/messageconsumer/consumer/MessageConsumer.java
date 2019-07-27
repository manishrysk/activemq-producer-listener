package com.rysk.messageconsumer.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import java.util.Map;

@Component
public class MessageConsumer {

    @JmsListener(destination = "myqueue")
    public void receiveMessage(final Map<String, String> jsonMessage) throws JMSException {
        System.out.println("Received message in consumer" + jsonMessage);
    }
}
