package com.orders.crudyorders.repos;

import com.orders.crudyorders.model.Customer;
import com.orders.crudyorders.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Order, Long>{
    List<Order> findAllByCustomer(Customer customer);

}