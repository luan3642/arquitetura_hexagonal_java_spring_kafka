package com.magalhaes.hexagonal.application.ports.out;

import com.magalhaes.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {





    Optional<Customer> find(String id);
}
