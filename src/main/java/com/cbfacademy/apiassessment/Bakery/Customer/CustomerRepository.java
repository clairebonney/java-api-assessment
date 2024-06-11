package com.cbfacademy.apiassessment.Bakery.Customer;

import org.springframework.data.repository.ListCrudRepository;

public interface CustomerRepository extends ListCrudRepository<Customer, Integer> {
    //<Customer, Integer> -refers to the table name and data type of the primary key (id)

} 