package com.composition.models;

public class Pessoa {
  private String nome;
  private boolean cnh;

  public Pessoa(String nome, boolean cnh) {
    setNome(nome);
    setCnh(cnh);
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public boolean isCnh() {
    return this.cnh;
  }

  public boolean getCnh() {
    return this.cnh;
  }

  public void setCnh(boolean cnh) {
    this.cnh = cnh;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Pessoa {");
    sb.append("\n   nome='").append(nome).append("',");
    sb.append("\n   cnh=").append(cnh).append("',");
    sb.append("\n  }");
    return sb.toString();
  }
}
