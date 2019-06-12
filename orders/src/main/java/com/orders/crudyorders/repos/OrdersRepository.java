package com.orders.crudyorders.repos;

import com.orders.crudyorders.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long>{

}