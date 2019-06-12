package com.orders.crudyorders.repos;

import com.orders.crudyorders.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long>{
    Customer findByCustname(String custname);
}