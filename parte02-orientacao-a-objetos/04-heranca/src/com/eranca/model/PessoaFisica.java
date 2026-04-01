package com.eranca.model;

public class PessoaFisica extends Pessoa {
  public String name;
  public String cpf;
  public int age;

  public PessoaFisica() {
  }
  public PessoaFisica(String name, String cpf) {
    this.name = name;
    this.cpf = cpf;
  }

  public String apresentar() {
    return "olá, meu nome é " + this.name + ". Prazer!";
  }

}
