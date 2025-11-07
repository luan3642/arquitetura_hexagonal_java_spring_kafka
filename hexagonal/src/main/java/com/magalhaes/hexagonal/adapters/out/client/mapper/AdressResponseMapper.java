package com.magalhaes.hexagonal.adapters.out.client.mapper;


import com.magalhaes.hexagonal.adapters.out.client.response.AdressResponse;
import com.magalhaes.hexagonal.application.core.domain.Adress;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdressResponseMapper {

    Adress toAdress(AdressResponse adressResponse);


}
