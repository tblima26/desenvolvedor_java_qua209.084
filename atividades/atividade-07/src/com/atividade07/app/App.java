package com.atividade07.app;

import java.util.Scanner;

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
                break;
            case 2:
                break;
        }
        sc.close();
    }
}
