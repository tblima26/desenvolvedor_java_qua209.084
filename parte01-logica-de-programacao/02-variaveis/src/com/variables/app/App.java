package com.variables.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inform one integer number:");
        int x = sc.nextInt();
        System.out.println("Value: " + x);
        sc.close();
    }
}
