package com.demoproducer.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demoproducer.demo.dto.MessageDTO;
import com.demoproducer.demo.service.AmqpService;

@RestController
public class AmqpAPI {

	@Autowired
	private AmqpService service;

	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping("/send")
	public void sendToConsumer(@RequestBody MessageDTO message) {
		
		this.service.sendToConsumer(message);
	}

}
