package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("--- List with Do and While ---");
        int x = i;
        do {
            System.out.println(i);
            i--;
        } while (i >= 0);
        /**
         * ANCHOR 
         * 
        System.out.println("--- List with While---");
        i = x;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("--- List with For ---");
        for (i = x; i >= 0; i--) {
             System.out.println(i);
        }         
        */
         System.out.println("--- FIM ---");
         sc.close();

    }
}
