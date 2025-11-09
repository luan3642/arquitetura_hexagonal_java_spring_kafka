package com.magalhaes.hexagonal.application.ports.out;

import com.magalhaes.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
