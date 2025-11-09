package com.magalhaes.hexagonal.adapters.in.controller.response;

import com.magalhaes.hexagonal.application.core.domain.Adress;
import lombok.Data;

@Data
public class CustomerResponse {

    private String nome;
    private AdressResponse adress;
    private String cpf;
    private Boolean isValidCpf;
}
