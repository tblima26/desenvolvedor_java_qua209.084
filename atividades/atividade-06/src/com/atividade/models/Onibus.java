package com.atividade.models;

public class Onibus extends Veiculo {
  private boolean leito;


  public Onibus(String fabricante, String modelo, String cor, String ano, String placa, boolean leito) {
    super(fabricante,modelo,cor,ano,placa);
    setLeito(leito);
  }


  public boolean isLeito() {
    return this.leito;
  }

  public boolean getLeito() {
    return this.leito;
  }

  public void setLeito(boolean leito) {
    this.leito = leito;
  }

}
