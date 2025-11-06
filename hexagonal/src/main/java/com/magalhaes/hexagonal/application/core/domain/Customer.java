package com.magalhaes.hexagonal.application.core.domain;

public class Customer {


    public Customer(){
        this.isValidCpf = false;
    }
    public Customer(Boolean isValidCpf, String cpf, Adress adress, String nome, String id) {
        this.isValidCpf = isValidCpf;
        this.cpf = cpf;
        this.adress = adress;
        this.nome = nome;
        this.id = id;
    }

    private String id;
    private String nome;
    private Adress adress;
    private String cpf;
    private Boolean isValidCpf;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
