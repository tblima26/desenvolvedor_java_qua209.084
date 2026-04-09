package com.atividade07.models;

import com.atividade07.repository.OperacaoConta;

public class ContaPJ extends Conta implements OperacaoConta{

  public ContaPJ(String agencia, String numeroConta, double saldo, Pessoa titular) {
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
