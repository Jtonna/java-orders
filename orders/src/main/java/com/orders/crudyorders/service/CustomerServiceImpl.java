package com.orders.crudyorders.service;

import com.orders.crudyorders.model.Agent;
import com.orders.crudyorders.model.Customer;
import com.orders.crudyorders.repos.CustomersRepository;
import com.orders.crudyorders.repos.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomersRepository customerrepos;

    @Autowired
    private OrdersRepository orderrepos;

    // generated methods

    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Customer findCustomerByName(String custName) {
        return null;
    }

    @Override
    public ArrayList<Customer> findAll() {
        return null;
    }

    @Override
    public ArrayList<Customer> findAllByAgent(Agent agent) {
        return null;
    }

    @Override
    public Customer update(Customer customer, long custCode) {
        return null;
    }

    @Override
    public void delete(long custCode) {

    }
}
