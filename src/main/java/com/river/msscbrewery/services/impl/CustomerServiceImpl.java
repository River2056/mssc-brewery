package com.river.msscbrewery.services.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.river.msscbrewery.services.CustomerService;
import com.river.msscbrewery.web.model.CustomerDto;

import lombok.extern.slf4j.Slf4j;

/**
 * CustomerServiceImpl
 */
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Kevin")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        // TODO impl update customer method
        log.debug("updating a customer, id: {}, customer: {}", customerId, customerDto);
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        // TODO impl a delete customer method
        log.debug("deleting a customer, id: {}", customerId);
    }
}
