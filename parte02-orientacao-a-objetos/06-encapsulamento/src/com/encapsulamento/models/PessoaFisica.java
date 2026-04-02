package com.encapsulamento.models;

final public class PessoaFisica extends Pessoa{
  private String nome;

  public PessoaFisica(String nome, String email, String cel) {
    super(email,cel);
    setNome(nome);
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
