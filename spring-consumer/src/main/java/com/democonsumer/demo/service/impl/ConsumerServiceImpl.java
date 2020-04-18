package com.democonsumer.demo.service.impl;

import org.springframework.stereotype.Service;

import com.democonsumer.demo.dto.MessageDTO;
import com.democonsumer.demo.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void action(MessageDTO message) {
		System.out.println(message.getText());
		
	}

}
