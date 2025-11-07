package com.magalhaes.hexagonal.adapters.out.repository;

import com.magalhaes.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.magalhaes.hexagonal.application.core.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
