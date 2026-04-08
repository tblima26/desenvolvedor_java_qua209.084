package com.interfaces.app;

import com.interfaces.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa homem = new Pessoa("Lula", 82);
        Pessoa mulher = new Pessoa("Janja", 60);

        System.out.println(homem.apresentar());
        System.out.println(mulher.apresentar());
        homem.cumprimentar(mulher.getNome());
        mulher.cumprimentar(homem.getNome());
        homem.falar("Vamos ser presos!");
        mulher.falar("Vai só você!");
    }
}
