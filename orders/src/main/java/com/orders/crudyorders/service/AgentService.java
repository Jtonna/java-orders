package com.orders.crudyorders.service;

import com.orders.crudyorders.model.Agent;
import com.orders.crudyorders.model.Customer;
import com.orders.crudyorders.model.Order;

import java.util.ArrayList;

public interface AgentService {

    // this creates data
    Customer save(Agent agent);

    // this reads data
    ArrayList<Agent> findAll();
    Agent findByCustomer(Customer customer);
    Agent findByOrder(Order order);

    // this updates data
    Customer update(Agent agent, long agentCode);

    // this deletes data
    void delete(long agentCode);
}
