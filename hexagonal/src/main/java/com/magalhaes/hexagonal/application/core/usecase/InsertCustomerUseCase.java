package com.magalhaes.hexagonal.application.core.usecase;

import com.magalhaes.hexagonal.application.core.domain.Customer;
import com.magalhaes.hexagonal.application.ports.out.FindAdressByZipCodeOutputPort;
import com.magalhaes.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {


    private final FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private InsertCustomerUseCase(
            InsertCustomerOutputPort insertCustomerOutputPort,
            FindAdressByZipCodeOutputPort findAdressByZipCodeOutputPort){
        this.findAdressByZipCodeOutputPort = findAdressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer customer, String zipCode){
        var adress = findAdressByZipCodeOutputPort.find(zipCode);
        customer.setAdress(adress);
        insertCustomerOutputPort.insert(customer);
    }
}
