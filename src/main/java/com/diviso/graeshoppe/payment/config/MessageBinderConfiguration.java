package com.diviso.graeshoppe.payment.config;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageBinderConfiguration {

	String PAYMENT="payment";
	
	@Output(PAYMENT)
	MessageChannel paymentOut();
	

	String NOTIFICATION="notification";
	
	@Output(NOTIFICATION)
	MessageChannel notificationOut();
}
