package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private final OrderRepository repository;

    @Autowired
    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public List<Order> listAll() {
        return repository.findAll();
    }

    @Transactional
    public Order get(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Transactional
    public Order save(Order order) {
        return repository.save(order);
    }

    @Transactional
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
