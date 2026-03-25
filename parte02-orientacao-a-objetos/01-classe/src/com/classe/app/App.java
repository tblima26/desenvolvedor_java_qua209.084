package com.classe.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Nome: ");
        p.name = sc.nextLine();
        System.out.println("Email: ");
        p.email = sc.nextLine();
        System.out.println("Altura: ");
        p.high = sc.nextDouble();
        sc.nextLine();
        System.out.println("Idade: ");
        p.age = sc.nextInt();

        Pessoa a = new Pessoa("Lucas", 15);
        a.email = "lucas@teste.com";
        a.high = 1.75;

        System.out.println(p);
        System.out.println(a);
        p.cumprimentar();
        a.apresentar();
        sc.close();
    }
}
