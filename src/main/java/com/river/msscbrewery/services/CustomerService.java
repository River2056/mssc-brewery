package com.river.msscbrewery.services;

import java.util.UUID;

import com.river.msscbrewery.web.model.CustomerDto;

/**
 * CustomerService
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
