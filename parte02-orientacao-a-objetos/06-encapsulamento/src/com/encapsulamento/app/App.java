package com.encapsulamento.app;

import javax.swing.JOptionPane;

import com.encapsulamento.models.PessoaFisica;
import com.encapsulamento.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica pf = new PessoaFisica("Thiago", "thiago@email.com", "61 9090 8080");
        PessoaJuridica pj = new PessoaJuridica("xerox@gmail.com", "61 9956 5544", null, "789456123");
        pj.setNomeFantasia("Xerox Feliz");
        JOptionPane.showMessageDialog(null, "Nome: " + pf.getNome());
        JOptionPane.showMessageDialog(null, "Nome Fantasia: " + pj.getNomeFantasia());
        /**
         * System.out.println("\n --- " + pf.getNome());]
         * System.out.println("\n --- " + pj.getNomeFantasia());
         * 
         */
    }
}
