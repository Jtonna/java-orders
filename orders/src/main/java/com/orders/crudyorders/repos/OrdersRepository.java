package com.orders.crudyorders.repos;

import com.orders.crudyorders.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Orders, Long> {
}
