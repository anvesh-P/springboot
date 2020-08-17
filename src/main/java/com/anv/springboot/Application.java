package com.anv.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(
				Application.class, args);

		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		jms.convertAndSend("ActiveMQ", "Sample ACtive Mq message");
	}
}
