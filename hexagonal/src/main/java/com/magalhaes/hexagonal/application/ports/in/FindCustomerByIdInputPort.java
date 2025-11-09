package com.magalhaes.hexagonal.application.ports.in;

import com.magalhaes.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);


}
