package com.atividade.models;

public class Carro extends Veiculo {
  private boolean bagageiro;

  public Carro(String fabricante, String modelo, String cor, String ano, String placa, boolean bagageiro) {
    super(fabricante, modelo, cor, ano, placa);
    setBagageiro(bagageiro);
  }

  public boolean isBagageiro() {
    return this.bagageiro;
  }

  public boolean getBagageiro() {
    return this.bagageiro;
  }

  public void setBagageiro(boolean bagageiro) {
    this.bagageiro = bagageiro;
  }

}
