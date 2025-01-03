package com.devo.customerservice.dto;


public record CustomerRequest(
        String name,
        String email,
        String phone,
        String address,
        boolean hasOrderAuthorization
) {
}
