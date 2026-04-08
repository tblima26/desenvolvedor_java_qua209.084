package com.interfaces.models;

import com.interfaces.repository.IPessoa;

public class Pessoa implements IPessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade) {
    setNome(nome);
    setIdade(idade);
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  @Override
  public String apresentar() {
    return "Olá, meu nome é " + getNome() + " e tenho " + getIdade() + " anos.";
  }

  @Override
  public void falar(String mensagem) {
    System.out.println(getNome() + " diz: " + mensagem+".");
  }

  @Override
  public void cumprimentar(String nome) {
    System.out.println(getNome()+" diz: Olá, " + nome + "! É um prazer te conhecer.");
  }
}