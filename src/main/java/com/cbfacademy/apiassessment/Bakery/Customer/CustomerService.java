package com.cbfacademy.apiassessment.Bakery.Customer;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;

@Service

public class CustomerService {
    public CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

     /**
     * Create a new Customer.
     *
     * @param customer The Customer object to create.
     * @return The created Customer.
     */
    Customer createCustomer(Customer customer) throws IllegalArgumentException, OptimisticLockingFailureException {
        return customerRepository.save(customer);
    }

    /**
     * Retrieve a list of all Customers.
     *
     * @return A list of all Customers.
     */
    List<Customer> getAllCustomers() {
        return customerRepository.findAll();

    }    

    /**
     * Retrieve a Customer by their ID.
     *
     * @param id The ID of the Customer to retrieve.
     * @return The Customer with the specified ID, or null if not found.
     */
    Customer getCustomer(int id) throws NoSuchElementException {
        return customerRepository.findById(id).orElseThrow();

    }

    /**
     * Update an existing Customer by their ID.
     *
     * @param id         The ID of the Customer to update.
     * @param updatedCustomer The updated Customer object.
     * @return The updated Customer, or null if the ID is not found.
     */

    Customer updateCustomer(int id, Customer updatedCustomer) throws NoSuchElementException {
        Customer customer = customerRepository.findById(id).orElseThrow(); //search the database for the record
        
        //change to new values
        customer.setUsername (updatedCustomer.getUsername());
        customer.setEmail (updatedCustomer.getEmail());
        customer.setFirstName (updatedCustomer.getFirstName());
        customer.setLastName (updatedCustomer.getLastName());
    
    
        return customerRepository.save(customer);  
        //return the (updated) customer -which has now been updated with the new/updated values
    }

    /**
     * Delete a Customer by ID.
     *
     * @param id The ID of the Customer to delete.
     */
    void deleteCustomer(int id) throws NoSuchElementException {
        Customer customer = customerRepository.findById(id).orElseThrow();  //finds/searches for the record of in the database
        customerRepository.delete(customer);  //deletes the record from the database once found

    }


}
