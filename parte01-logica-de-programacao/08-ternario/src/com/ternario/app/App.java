package com.ternario.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Idade: ");
        int age = sc.nextInt();

        String result = (age > 17) ? "Maior de idade" : "Menor de idade";
        System.out.println(name+" é "+result);
        sc.close();
    }
}
