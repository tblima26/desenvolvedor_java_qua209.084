package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        do {
            try {
                System.out.println("What your age?");
                age = sc.nextInt();
            } catch (Exception e) {
                // TODO: Only numbers are accepted
                System.out.println("Only number are accepted");
            }
        } while (age == 0);
        if (age > 17) {
            System.out.println("You are an adult!");
        }
        if (age <= 17 && age > 1) {
            System.out.println("You are a poor kid!");
        } else {
            System.out.println("This age don't exist.");
        }
        sc.close();
    }
}
