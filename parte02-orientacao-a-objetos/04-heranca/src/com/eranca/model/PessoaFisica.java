package com.eranca.model;

public class PessoaFisica extends Pessoa {
  public String name;
  public String cpf;
  public int age;

  public PessoaFisica() {
  }

  public String apresentar() {
    return "olá, meu nome é " + this.name + ". Prazer!";
  }

}
