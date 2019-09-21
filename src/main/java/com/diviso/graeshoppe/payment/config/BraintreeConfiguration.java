package com.diviso.graeshoppe.payment.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.braintreegateway.BraintreeGateway;
import com.braintreegateway.Environment;

@Configuration
public class BraintreeConfiguration {

	@Value("${braintree.merchantId}")
	private String merchantId;
	@Value("${braintree.publicKey}")
	private String publicKey;
	@Value("${braintree.privateKey}")
	private String privateKey;
	@Value("${braintree.environment}")
	private String environment;

	@SuppressWarnings({ "unlikely-arg-type", "null" })
	@Bean
	public BraintreeGateway getBraintreeGateway() {
		Environment environment = null;
		if (environment.equals("sandbox")) {
			environment = Environment.SANDBOX;
		} else if (environment.equals("development")) {
			environment = Environment.DEVELOPMENT;
		} else if (environment.equals("production")) {
			environment = Environment.PRODUCTION;
		}

		BraintreeGateway gateway = new BraintreeGateway(environment, merchantId, publicKey, privateKey);
		return gateway;
	}
}
