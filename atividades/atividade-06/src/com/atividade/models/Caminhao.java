package com.atividade.models;

public class Caminhao extends Veiculo {
  private boolean carroceria;

  public Caminhao(String fabricante, String modelo, String cor, String ano, String placa, boolean carroceria) {
    super(fabricante, modelo, cor, ano, placa);
    setCarroceria(carroceria);
  }

  public boolean isCarroceria() {
    return this.carroceria;
  }

  public boolean getCarroceria() {
    return this.carroceria;
  }

  public void setCarroceria(boolean carroceria) {
    this.carroceria = carroceria;
  }



}
