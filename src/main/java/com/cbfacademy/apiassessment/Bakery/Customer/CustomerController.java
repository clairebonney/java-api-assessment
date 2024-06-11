package com.cbfacademy.apiassessment.Bakery.Customer;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.dao.OptimisticLockingFailureException;
//import org.hibernate.mapping.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/*
 * Create an CustomerController class with the following members:

CustomerService customerService - an instance of the service interface
CustomerController(CustomerService customerService) - constructor that accepts an instance of the service interface
 */

 @RestController
 @RequestMapping("/api/customers")

public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
}
@GetMapping
public List<Customer> getAllCustomers() {
    try {
        List<Customer> listCustomers = customerService.getAllCustomers();
        return listCustomers;
    } catch (NoSuchElementException e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer with given id not found", e);
    }

}

/*
     * gets the endpoint by a specific id
     * 
     * @param id The id of the Customer to retrieve
     * 
     * @return returns the Customer of the id given
     * 
     * @catch exception handling of the return statement
     */
    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable int id) {
        try {
            return customerService.getCustomer(id);

        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "IOU with given id not found", e);
        }

    }

    /*
     * Posts a message into the body of Postman
     * 
     * @param customer The body of the customer to be posted
     * 
     * @return returns the created customer message
     * 
     * @catch exception handling of the return statement
     * 
     * ResponseEntity wraps the body message from Postman in the correct format (http response)
     */
    @PostMapping
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
        try {
            Customer createdCustomer = customerService.createCustomer(customer);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
        } catch (IllegalArgumentException i) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, i.getMessage(), i);
        } catch (OptimisticLockingFailureException o) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, o.getMessage(), o);
        }
    }

    /*
     * Updates a message using the with a specific id
     * 
     * @param id The id of the of the Customer to be updated
     * 
     * @param customer The body of the customer to be updated
     * 
     * @return returns the updated customer
     * 
     * @catch exception handling of the return statement
     * 
     * ResponseEntity wraps the body message from Postman in the correct format (http response)
     */
    @PutMapping("/{id}")
    public ResponseEntity<Customer> putCustomer(@PathVariable int id, @RequestBody Customer customer) {
        try {
            Customer updatedCustomer = customerService.updateCustomer(id, customer);
            return ResponseEntity.status(HttpStatus.OK).body(updatedCustomer);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer with given id not found", e);
        }
        
    }

    /*
     * Deletes a message with a specific id
     * 
     * @param id The id of the Customer to delete
     */
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        try {
            customerService.deleteCustomer(id);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer with given id not found", e);
        }
         
    }
}

