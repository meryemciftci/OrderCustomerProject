package com.devo.orderservice.dto;

public record ProductRequest(
        String name,
        Double price
) {
}
