package com.demoproducer.demo.service;

import com.demoproducer.demo.dto.MessageDTO;

public interface AmqpService {
	void sendToConsumer(MessageDTO message);
}
