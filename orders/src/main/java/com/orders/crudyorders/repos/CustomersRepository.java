package com.orders.crudyorders.repos;

import com.orders.crudyorders.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customers, Long> {
    Customers findCustomersByCustName(String custName);
}
