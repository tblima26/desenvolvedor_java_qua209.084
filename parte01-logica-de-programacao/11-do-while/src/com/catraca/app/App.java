package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int option;
        String nome, autorizado;
        double altura, peso;
        do {
            System.out.println("Name: ");
            nome = sc.nextLine();
            System.out.println("Altura: ");
            altura = sc.nextDouble();
            System.out.println("Peso: ");
            peso = sc.nextDouble();

            sc.nextLine();
            System.out.println("--- Pessoa ---");
            System.out.println(nome);
            System.out.println(altura);
            System.out.println(peso);
            autorizado = (peso <120) ? 
            (altura >= 1.25) ? "Autorizado":"Não autorizado..."
            : "Não autorizado...";

            System.out.println(autorizado);

            System.out.println("Continuar?");
            System.out.println("1 - sim | 2 - não");
            option = sc.nextInt();
            sc.nextLine();

        } while (option == 1);
        sc.close();
    }
}