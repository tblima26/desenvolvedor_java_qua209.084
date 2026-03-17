package com.notas.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Nota: ");
        double grade = sc.nextDouble();

        if (grade >= 0 && grade <= 10) {
            if (grade >= 7) {
                System.out.println(name + " está aprovado");
            } else if (grade >= 5) {
                System.err.println(name + " está de recuperação");
            } else {
                System.err.println(name + " está de reprovado");
            }

        } else {
            System.out.println("Grade invalid.");
        }

        sc.close();
    }
}
