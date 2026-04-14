package com.swing.app;

import javax.swing.JOptionPane;

import com.swing.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        double options;
        Pessoa p = new Pessoa(null, "023.412.731-73", "61 981881223");
        p.setName(JOptionPane.showInputDialog("Informe seu nome"));
        options = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor númerico:").replace(",","."));
        JOptionPane.showMessageDialog(null, "Seu nome é " + p.getName());
        JOptionPane.showMessageDialog(null, "Numero informado: \n" + options);
    }
}
