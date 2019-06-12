package com.orders.crudyorders.service;

import com.orders.crudyorders.model.Agent;
import com.orders.crudyorders.model.Customer;
import com.orders.crudyorders.model.Order;
import com.orders.crudyorders.repos.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersRepository orderrepo;
    
    // generated methods

    @Override
    public Customer save(Order order) {
        return null;
    }

    @Override
    public ArrayList<Order> findAll() {
        return null;
    }

    @Override
    public ArrayList<Order> findAllByAgent(Agent agent) {
        return null;
    }

    @Override
    public ArrayList<Order> findAllByCustomer(Customer customer) {
        return null;
    }

    @Override
    public Customer update(Order order, long ordNum) {
        return null;
    }

    @Override
    public void delete(long ordNum) {

    }
}
