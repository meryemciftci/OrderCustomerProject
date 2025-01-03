package com.devo.orderservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

@Service
public class CustomerServiceClient {

    private final WebClient webClient;

    public CustomerServiceClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://customer-service").build();
    }

    public boolean isCustomerAuthorized(Long customerId) {
        try {
            return webClient.get()
                    .uri("/api/customers/{id}/authorized", customerId)  // "/api/customers" yolunun tam olduğundan emin olun
                    .retrieve()
                    .bodyToMono(Boolean.class)
                    .block();
        } catch (WebClientResponseException ex) {
            return false;
        } catch (Exception e) {
            throw new RuntimeException("Error while calling Customer Service", e);
        }
    }
}
