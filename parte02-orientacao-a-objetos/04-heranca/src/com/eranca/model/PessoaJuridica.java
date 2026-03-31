package com.eranca.model;

public class PessoaJuridica extends Pessoa {
  public String razaoSocial;
  public String nomeFantasia;
  public String cnpj;
  public String site;

  public PessoaJuridica() {

  }

  public String recepcionar(String name) {
    return "Prazer, " + name + ". Somos a empresa " + this.nomeFantasia + ".";
  }
}
