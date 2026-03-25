package com.classe.app;

public class Pessoa {
  public String name, email;
  public int age;
  public double high;

  public Pessoa( String name,int age){
    this.name = name;
    this.age = age;
  }
  public Pessoa(){}

  public void cumprimentar() {
    System.out.println("Olá, boa noite!");
  }
  public void apresentar() {
    System.out.println("Meu nome é "+this.name+".");
    System.out.println("Meu email é "+this.email+".");
    System.out.println("Minha idade é "+this.age+".");
    System.out.println("Minha altura é "+this.high+".");
  }
}
