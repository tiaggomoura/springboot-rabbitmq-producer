package com.democonsumer.demo.amqp.impl;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.democonsumer.demo.amqp.AmqpConsumer;
import com.democonsumer.demo.dto.MessageDTO;
import com.democonsumer.demo.service.impl.ConsumerServiceImpl;

@Component
public class RabbitMQConsumer implements AmqpConsumer<MessageDTO> {

	@Autowired
	private ConsumerServiceImpl service;

	@Override
	@RabbitListener(queues = "$(spring.rabbit.request.routing-key.producer)")
	public void consumer(MessageDTO message) {
		this.service.action(message);
	}

}
