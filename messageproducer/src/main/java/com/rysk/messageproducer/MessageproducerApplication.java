package com.rysk.messageproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class MessageproducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageproducerApplication.class, args);
	}

}
