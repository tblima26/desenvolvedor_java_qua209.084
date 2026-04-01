package com.polimorfismo.app;

import com.polimorfismo.models.PessoaFisica;
import com.polimorfismo.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica pf = new PessoaFisica("61 99998888", "joao@gmail.com", "Joao Pedro", "0123012345", 30);
        PessoaJuridica pj = new PessoaJuridica("cafeteria@gmail.com", "61 954363663", "+Café", "789456123");

        System.out.println(" --- Dados da PF --- ");
        pf.exibirDados();
        System.out.println(" --- Dados da PF --- ");
        pj.exibirDados();

    }
}
