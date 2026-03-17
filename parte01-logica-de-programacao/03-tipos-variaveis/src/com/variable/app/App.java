package com.variable.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Nome: ");
        nome = sc.nextLine();
        int i = 0;
        do {
            try {
                System.out.println("Age: ");
                i = sc.nextInt();
                if (i <= 0) {
                    System.out.println("Invalid Age! Say again... ");
                }
            } catch (Exception e) {
                System.out.println("Only integer numbers are accepted!");
                i = 0;
            }
        } while (i <= 0);
        double high;
        System.out.println("High: ");
        high = sc.nextDouble();
        sc.nextLine();
        String email;
        System.out.println("Email: ");
        email = sc.nextLine();
        System.out.println(nome + " tem " + i + " anos e sua altura é " + high);
        System.out.println(email);
        sc.close();

    }
}
