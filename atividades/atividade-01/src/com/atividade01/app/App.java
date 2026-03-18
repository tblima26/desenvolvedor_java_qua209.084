package com.atividade01.app;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        System.out.println("Altura: ");
        double high = sc.nextDouble();
        double imc = peso / (high * high);
        String result = "";
        result = (imc >= 18.5 && imc <= 24.9) ? "Peso ideal!" : "Você está com sobrepeso!";
        if (imc < 18.5)
            result = "Abaixo do peso ideal.";
        if (imc > 30)
            result = "Muito acima do peso ideal.";
        System.out.println(result);
        // JOptionPane.showMessageDialog(null, result);
    }
}
