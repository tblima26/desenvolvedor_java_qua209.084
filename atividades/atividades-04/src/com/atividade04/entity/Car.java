package com.atividade04.entity;

public class Car {
  public String fabricante, modelo, placa, cor;
  public int ano;

  public Car () {

  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("--- Carro--- ").append(System.lineSeparator());
    sb.append(" Fabricante: ").append(this.fabricante).append(System.lineSeparator())
      .append(" Modelo: ").append(this.modelo).append(System.lineSeparator())
      .append(" Placa: ").append(this.placa).append(System.lineSeparator())
      .append(" Cor: ").append(this.cor);
    return sb.toString();
  }
  
}
