package com.reactive.app.service;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyExtractors;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import com.reactive.app.configuration.RestEndpoints;
import com.reactive.app.model.Customer;
import com.reactive.app.util.JacksonUtils;

import reactor.core.publisher.Mono;

@Service
public class PDFConsumerService {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	private final WebClient webClient;

	public PDFConsumerService(WebClient webClient) {
		this.webClient = webClient;
	}

	// public Mono<ClientResponse> getPDF() {
	public Mono<Customer> getPDF() {

		if (logger.isInfoEnabled()) {
			logger.info(" getting PDF ");
		}
		// return null;
		return this.webClient.post()
				// .uri(RestEndpoints.NEW_CUSTOMER_ENDPOINT)
				.uri(RestEndpoints.NEW_CUSTOMER_ENDPOINT).body(BodyInserters.fromObject(null)).exchange()
				.flatMap(response -> response.body(BodyExtractors.toMono(Customer.class)));

	}

}
