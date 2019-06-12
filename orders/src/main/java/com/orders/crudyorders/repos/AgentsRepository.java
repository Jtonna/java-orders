package com.orders.crudyorders.repos;

import com.orders.crudyorders.model.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agents, Long> {
}