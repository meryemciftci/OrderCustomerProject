package com.devo.orderservice.dto;

import java.util.List;

public record OrderRequest(
        Long customerId,
        List<Long> productIds
) {
}
