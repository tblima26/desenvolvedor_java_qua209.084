package com.polimorfismo.models;

public class Pessoa {
  public String telefone;
  public String email;

  public Pessoa(String telefone, String email) {
    this.telefone = telefone;
    this.email = email;
  }
  public void exibirDados(){
    System.out.println("tel: "+this.telefone);
    System.out.println("email: "+this.email);
  }
}
