package com.atividade.models;

public class Veiculo {
  private String fabricante, modelo, cor, ano ,placa;


  public Veiculo(String fabricante, String modelo, String cor, String ano, String placa) {
    setFabricante(fabricante);
    setModelo(modelo);
    setCor(cor);
    setAno(ano);
    setPlaca(placa);
  }
 

  public String getFabricante() {
    return this.fabricante;
  }

  public void setFabricante(String fabricante) {
    this.fabricante = fabricante;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public String getAno() {
    return this.ano;
  }

  public void setAno(String ano) {
    this.ano = ano;
  }

  public String getPlaca() {
    return this.placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

}
