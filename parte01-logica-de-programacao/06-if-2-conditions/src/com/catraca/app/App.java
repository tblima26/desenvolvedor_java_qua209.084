package com.catraca.app;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Altura: ");
        double high = sc.nextDouble();
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        
        if (high > 1.25 && peso > 20.0) {
            JOptionPane.showMessageDialog(null, name + ", you are accepted.");
        }
        sc.close();
    }
}
