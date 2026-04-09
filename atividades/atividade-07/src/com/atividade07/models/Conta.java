package com.atividade07.models;

public class Conta {
  private String agencia, numeroConta;
  private double saldo;
  private Pessoa titular;

  public Conta(String agencia, String numeroConta, double saldo, Pessoa titular) {
    setAgencia(agencia);
    setNumeroConta(numeroConta);
    setSaldo(saldo);
    setTitular(titular);
  }

  public String getAgencia() {
    return this.agencia;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public String getNumeroConta() {
    return this.numeroConta;
  }

  public void setNumeroConta(String numeroConta) {
    this.numeroConta = numeroConta;
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public Pessoa getTitular() {
    return this.titular;
  }

  public void setTitular(Pessoa titular) {
    this.titular = titular;
  }

}
