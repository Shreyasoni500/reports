package com.control.textlocal.reports.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SendMessageSource {
	@Output("sendMessageChannel")
	
	String MESSAGING = "sendMessageChannel";
	@Input(MESSAGING)
	MessageChannel sendMessage();
	SubscribableChannel consumeMessage();
}
