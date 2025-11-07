package com.magalhaes.hexagonal.application.ports.out;

import com.magalhaes.hexagonal.application.core.domain.Adress;

public interface FindAdressByZipCodeOutputPort {

    Adress find(String zipCode);
}
