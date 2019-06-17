package com.orders.crudyorders.service;

import com.orders.crudyorders.model.Agent;
import com.orders.crudyorders.model.Customer;

import java.util.ArrayList;

public interface CustomerService {

    // creates
    Customer save(Customer customer);

    // reads
    Customer findCustomerByName(String custName);
    ArrayList<Customer> findAll();
    ArrayList<Customer> findAllByAgent(Agent agent);

    // updates
    Customer update(Customer customer, long custCode);

    //deletes
    void delete(long custCode);
}
