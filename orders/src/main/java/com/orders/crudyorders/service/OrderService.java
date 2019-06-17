package com.orders.crudyorders.service;

import com.orders.crudyorders.model.Agent;
import com.orders.crudyorders.model.Customer;
import com.orders.crudyorders.model.Order;

import java.util.ArrayList;

public interface OrderService {

    // creates
    Customer save(Order order);

    // reads
    ArrayList<Order> findAll();
    ArrayList<Order> findAllByAgent(Agent agent);
    ArrayList<Order> findAllByCustomer(Customer customer);

    // updates
    Customer update(Order order, long ordNum);

    // deletes
    void delete(long ordNum);
}
