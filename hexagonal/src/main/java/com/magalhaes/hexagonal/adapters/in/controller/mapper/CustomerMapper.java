package com.magalhaes.hexagonal.adapters.in.controller.mapper;

import com.magalhaes.hexagonal.adapters.in.controller.request.CustomerRequest;
import com.magalhaes.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "adress", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);
}
