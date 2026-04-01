package com.polimorfismo.models;

public class PessoaFisica extends Pessoa {
  public String nome;
  public String cpf;
  public int idade;

  public PessoaFisica(String telefone, String email, String nome, String cpf, int idade) {
    super(telefone, email);
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
  }
  public void exibirDados(){
    super.exibirDados();
    System.out.println("nome: "+this.nome);
    System.out.println("cpf: "+this.cpf);
    System.out.println("idade: "+this.idade);
  }
}
