package com.atividade.app;

import javax.swing.JOptionPane;

import com.atividade.models.Pessoa;

public class App {

    /**
     * TODO - ATIVIDADE 08
     * Crie um programa, onde o usuario passe os valores usando o JOptionPane.
     * O prgrama deve dizer se é maior de idade;
     * 
     * 
     */
    public static void main(String[] args) throws Exception {
        String name;
        int age;

        name = JOptionPane.showInputDialog("Informe seu nome: ");
        age = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

        Pessoa p = new Pessoa(name, age);

        String response = (p.getAge() <= 18 ? " -- Menor de idade." : " ++ Maior de idade!");

        JOptionPane.showMessageDialog(null, p.getName() + ", sua idade é " + p.getAge() + ". \n\n" + response);
    }
}
