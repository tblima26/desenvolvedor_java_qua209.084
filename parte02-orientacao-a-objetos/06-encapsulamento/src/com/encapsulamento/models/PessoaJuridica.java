package com.encapsulamento.models;

public class PessoaJuridica extends Pessoa {
  private String nomeFantasia;
  private String cnpj;

  public PessoaJuridica(String email, String cel, String nomeFantasia, String cnpj) {
    super(email, cel);
    setNomeFantasia(nomeFantasia);
    setCnpj(cnpj);
  }

  public String getNomeFantasia() {
    return this.nomeFantasia;
  }

  public void setNomeFantasia(String nomeFantasia) {
    this.nomeFantasia = nomeFantasia;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

}
