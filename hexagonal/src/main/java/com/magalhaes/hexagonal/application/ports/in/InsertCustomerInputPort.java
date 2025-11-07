package com.magalhaes.hexagonal.application.ports.in;

import com.magalhaes.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
