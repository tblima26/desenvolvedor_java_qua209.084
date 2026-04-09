package com.atividade07.models;

import com.atividade07.repository.OperacaoConta;

public class ContaPJ extends Conta implements OperacaoConta {

  public ContaPJ(String agencia, String numeroConta, double saldo, Pessoa titular) {
    super(agencia, numeroConta, saldo, titular);

  }

  @Override
  public void sacar(double valor) {
    if (valor <= 0) {
      System.out.println("Saldo insuficiente!");
      return;
    }

    double taxa = valor * 0.0001;
    double total = valor + taxa;

    if (total <= this.getSaldo()) {
      this.setSaldo(this.getSaldo() - total);
      System.out.println("Saque realizado com sucesso.");
      System.out.println("Taxa cobrada: R$ " + taxa);
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  @Override
  public void depositar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor inválido.");
      return;
    }

    this.setSaldo(this.getSaldo() + valor);
    System.out.println("Depósito realizado com sucesso.");
  }

  @Override
  public void consultar() {
    PessoaJuridica pj = (PessoaJuridica) getTitular();

    System.out.println("\n--- DADOS DA CONTA PJ ---");
    System.out.println("Razão Social: " + pj.getRazaoSocial());
    System.out.println("Email: " + pj.getEmail());
    System.out.println("CNPJ: " + pj.getCnpj());
    System.out.println("Agência: " + getAgencia());
    System.out.println("Conta: " + getNumeroConta());
    System.out.println("Saldo: R$ " + getSaldo());
  }

}
