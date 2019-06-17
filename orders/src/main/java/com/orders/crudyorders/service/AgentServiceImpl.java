package com.orders.crudyorders.service;

import com.orders.crudyorders.model.Agent;
import com.orders.crudyorders.model.Customer;
import com.orders.crudyorders.model.Order;
import com.orders.crudyorders.repos.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "AgentService")
public class AgentServiceImpl implements AgentService {
    // this is where the majority of the work happens
    // service connects 2 database through repo, repo brings in data, service manipulates data & or send it to the repo or the controller.

    @Autowired
    private AgentsRepository agentrepos;

    // generated methods.

    @Override
    public Customer save(Agent agent) {
        return null;
    }

    @Override
    public ArrayList<Agent> findAll() {
        ArrayList<Agent> AgentOverrideList = new ArrayList<>();
        agentrepos.findAll().iterator().forEachRemaining(AgentOverrideList::add);
        return AgentOverrideList;
    }

    @Override
    public Agent findByCustomer(Customer customer) {
        return null;
    }

    @Override
    public Agent findByOrder(Order order) {
        return null;
    }

    @Override
    public Customer update(Agent agent, long agentCode) {
        return null;
    }

    @Override
    public void delete(long agentCode) {

    }
}
