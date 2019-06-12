package com.orders.crudyorders.repos;

import com.orders.crudyorders.model.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long> {

}