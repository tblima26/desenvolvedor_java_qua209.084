package com.construtor.app;

import java.util.Scanner;

import com.construtor.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Telefone: ");
        String cel = sc.nextLine();

        p1.setName(name);
        p1.setPhone(cel);
        Pessoa p2 = new Pessoa("João","61 99009090");

        System.out.println("Pessoa 1: "+p1);
        System.out.println("Pessoa 2: "+p2);
        sc.close();
    }
}
