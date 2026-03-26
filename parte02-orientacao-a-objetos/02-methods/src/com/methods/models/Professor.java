package com.methods.models;

public class Professor {
  public String name;
  public String subject;

  public String present (){
    return "Olá, meu nome é "+ this.name+". Dou aula de "+this.subject ;
  }
  public double calcArea(double x, double y){
    return x * y;
  }
}
