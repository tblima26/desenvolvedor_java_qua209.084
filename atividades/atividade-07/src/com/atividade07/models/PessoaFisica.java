package com.atividade07.models;

public class PessoaFisica extends Pessoa {
  private String cpf;

  public PessoaFisica(String nome, String email,String cpf) {
    super(nome, email);
    setCpf(cpf);
  }


  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
