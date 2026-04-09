package com.atividade07.app;

import java.util.Scanner;

import com.atividade07.models.*;

public class App {
    /**
     * TODO
     * Crie um programa de aplicativo de banco:
     * - o usuario podera escolher se deseja entrar como pessoa fisica/ juridica
     * - devera informar:
     * --> nome, email e cpf (Pessoa Fisica)
     * --> nome fantasia, razão social, email e cnpj (Pessoa Juridica)
     * - o programa devera informar a agencia e conta do titular (uma única vez
     * durante todo o programa)
     * Em seguida, o programa devera exibir as opções para o usuario:
     * - consultar dados da conta, fazer saque, fazer deposito, sair do programa
     * O programa devera cobrar uma taxa de 0,01% em cima de cada saque feito pela
     * pessoa juridica.
     * Qualquer saque só podera ser feito caso o valor do saque seja menor ou igual
     * ao saldo da conta.
     * 
     * NOTE use os 4 pilares da orientação a objetos, mais interface e composição
     * ANCHOR - Divirtam-se!!!!
     * 
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        do {
            System.out.println("\n --- INTERNET BANKER ---");
            System.out.println("Como deseja logar?");
            System.out.println("1- Pessoa Fisica");
            System.out.println("2- Pessoa Juridica");
            menu = sc.nextInt();
        } while (menu < 1 || menu > 2);
        switch (menu) {
            case 1:
                PessoaFisica pf = new PessoaFisica(
                        "João Silva",
                        "joao@email.com",
                        "12345678900");
                ContaPF conta = new ContaPF("4566-8", "200,325,365", 2000, pf);
                int opcao;
                do {
                    System.out.println("\n--- MENU ---");
                    System.out.println("1- Consultar dados");
                    System.out.println("2- Sacar");
                    System.out.println("3- Depositar");
                    System.out.println("4- Sair");
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            conta.consultar();
                            break;

                        case 2:
                            System.out.print("Valor do saque: ");
                            double saque = sc.nextDouble();
                            conta.sacar(saque);
                            break;

                        case 3:
                            System.out.print("Valor do depósito: ");
                            double deposito = sc.nextDouble();
                            conta.depositar(deposito);
                            break;

                        case 4:
                            System.out.println("Encerrando...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opcao != 4);
                break;
            case 2:
                PessoaFisica pj = new PessoaFisica("Festa e Cia", "festaecia@teste.com", "023.654.789-79");
                ContaPF conta2 = new ContaPF("4566-8", "200,325,365", 2000, pj);
                int opcao2;
                do {
                    System.out.println("\n--- MENU ---");
                    System.out.println("1- Consultar dados");
                    System.out.println("2- Sacar");
                    System.out.println("3- Depositar");
                    System.out.println("4- Sair");
                    opcao2 = sc.nextInt();
                    switch (opcao2) {
                        case 1:
                            conta2.consultar();
                            break;

                        case 2:
                            System.out.print("Valor do saque: ");
                            double saque = sc.nextDouble();
                            conta2.sacar(saque);
                            break;

                        case 3:
                            System.out.print("Valor do depósito: ");
                            double deposito = sc.nextDouble();
                            conta2.depositar(deposito);
                            break;

                        case 4:
                            System.out.println("Encerrando...");
                            break;

                        default:
                            System.out.println("Opção inválida.");
                    }
                } while (opcao2 != 4);
                break;
        }
        sc.close();
    }
}
