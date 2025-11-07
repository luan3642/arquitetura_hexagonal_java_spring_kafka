package com.magalhaes.hexagonal.adapters.out.client;


import com.magalhaes.hexagonal.adapters.out.client.response.AdressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
    name = "FindAdressByZipCodeClient",
    url = "${magalhaes.client.adress.url}"
)


public interface FindAdressByZipCodeClient {

    @GetMapping("/{zipCode}")
    AdressResponse find(@PathVariable("zipCode") String zipCode);


}
