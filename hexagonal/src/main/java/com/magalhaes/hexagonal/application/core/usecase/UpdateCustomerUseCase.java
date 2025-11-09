package com.magalhaes.hexagonal.application.core.usecase;

import com.magalhaes.hexagonal.application.core.domain.Customer;
import com.magalhaes.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.magalhaes.hexagonal.application.ports.out.FindAdressByZipCodeOutputPort;
import com.magalhaes.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustomerUseCase {


    private final FindCustomerByIdInputPort findCustomerByIdInputPort;
    private final FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;

    public UpdateCustomerUseCase(
            FindCustomerByIdInputPort findCustomerByIdInputPort,
            FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort){
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
        this.findAdressByZipCodeOutputPort = findAdressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    public void update(Customer customer, String zipCode){
        findCustomerByIdInputPort.find(customer.getId());
        var adress = findAdressByZipCodeOutputPort.find(zipCode);
        customer.setAdress(adress);
        updateCustomerOutputPort.update(customer);
    }
}
