package com.polimorfismo.models;

public class PessoaJuridica extends Pessoa{
  public String nomeFantasia;
  public String cnpj;

  public PessoaJuridica(String email,String telefone,String nomeFantasia, String cnpj) {
    super(email,telefone);
    this.nomeFantasia = nomeFantasia;
    this.cnpj = cnpj;
  }

  public void exibirDados() {
    System.out.println("Nome Fantasia: "+this.nomeFantasia);
    System.out.println("CNPJ: "+this.cnpj);
  }
}
