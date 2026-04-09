package com.atividade07.repository;

public interface OperacaoConta {
  void sacar(double valor);

  void depositar(double valor);

  void consultar();
}
