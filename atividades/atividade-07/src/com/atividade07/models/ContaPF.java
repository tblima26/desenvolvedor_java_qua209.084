package com.atividade07.models;

import com.atividade07.repository.OperacaoConta;

public class ContaPF extends Conta implements OperacaoConta{

  public ContaPF(String agencia, String numeroConta, double saldo, Pessoa titular) {
    super(agencia, numeroConta, saldo, titular);
    
  }

  @Override
  public void sacar(double valor) {
    
  }

  @Override
  public void depositar(double valor) {
    
  }

  @Override
  public void consultar() {
    
  }

}
