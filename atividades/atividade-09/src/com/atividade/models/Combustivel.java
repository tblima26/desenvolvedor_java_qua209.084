package com.atividade.models;

public class Combustivel {
  private double price;


  public Combustivel(double price) {
    setPrice(price);
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
