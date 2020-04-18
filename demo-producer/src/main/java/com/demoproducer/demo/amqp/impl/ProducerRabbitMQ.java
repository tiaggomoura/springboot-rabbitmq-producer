package com.demoproducer.demo.amqp.impl;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.demoproducer.demo.dto.MessageDTO;
import com.demoproducer.demo.interfaces.AmqpProducer;

@Component
public class ProducerRabbitMQ implements AmqpProducer<MessageDTO> {

	@Value("$(spring.rabbit.request.routing-key.producer)")
	private String queue;

	@Value("$(spring.rabbit.request.exchange.producer)")
	private String exchange;

	@Autowired
	private RabbitTemplate template;

	@Override
	public void producer(MessageDTO message) {
		try {
			template.convertAndSend(this.exchange, this.queue, message);
		} catch (Exception e) {
			throw new AmqpRejectAndDontRequeueException(e);
		}

	}

}
