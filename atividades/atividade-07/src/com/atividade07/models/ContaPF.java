package com.atividade07.models;

import com.atividade07.repository.OperacaoConta;

public class ContaPF extends Conta implements OperacaoConta {

  public ContaPF(String agencia, String numeroConta, double saldo, Pessoa titular) {
    super(agencia, numeroConta, saldo, titular);

  }

  @Override
  public void sacar(double valor) {
    if (valor <= 0) {
      System.out.println("Valor inválido.");
      return;
    }

    if (valor <= this.getSaldo()) {
      this.setSaldo(this.getSaldo() - valor);
      System.out.println("Saque realizado com sucesso!");
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
    System.out.println("Depósito realizado com sucesso!");
  }

  @Override
  public void consultar() {
    System.out.println("\n--- DADOS DA CONTA ---");
    System.out.println("Nome: " + getTitular().getNome());
    System.out.println("Email: " + getTitular().getEmail());
    System.out.println("CPF: " + ((PessoaFisica) getTitular()).getCpf());
    System.out.println("Agência: " + getAgencia());
    System.out.println("Conta: " + getNumeroConta());
    System.out.println("Saldo: R$ " + getSaldo());
  }

}
