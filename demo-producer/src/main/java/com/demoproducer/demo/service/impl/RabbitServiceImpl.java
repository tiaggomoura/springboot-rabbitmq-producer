package com.demoproducer.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoproducer.demo.dto.MessageDTO;
import com.demoproducer.demo.interfaces.AmqpProducer;
import com.demoproducer.demo.service.AmqpService;

@Service
public class RabbitServiceImpl  implements AmqpService{

	@Autowired
	private AmqpProducer<MessageDTO> amqp;
	
	@Override
	public void sendToConsumer(MessageDTO message) {
		this.amqp.producer(message);
		
	}

}
