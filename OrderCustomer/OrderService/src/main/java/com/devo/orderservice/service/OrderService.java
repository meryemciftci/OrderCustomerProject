package com.devo.orderservice.service;

import com.devo.orderservice.model.Order;
import com.devo.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CustomerServiceClient customerServiceClient;
    public Order createOrder(Order order) {
        if (!customerServiceClient.isCustomerAuthorized(order.getCustomerId())) {
            return null;
        }
        return orderRepository.save(order);
    }
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    public Order updateOrder(Long id, Order order) {
        if (!orderRepository.existsById(id)) {
            return null;
        }
        Order existingOrder = orderRepository.findById(id).get();
        existingOrder.setCustomerId(order.getCustomerId());
        return orderRepository.save(existingOrder);
    }
    public void deleteOrder(Long id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
        }
    }
}
