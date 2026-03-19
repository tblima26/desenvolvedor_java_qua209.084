package com.calculator.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number 1:");
        double n1 = sc.nextDouble();
        System.out.println("Number 2:");
        double n2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Addition result: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction result: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication result: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Division result: " + (n1 / n2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid option! Please try again.");
                break;
        }
        sc.close();
    }
}
