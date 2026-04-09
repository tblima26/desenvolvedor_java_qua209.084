package com.composition.app;

import com.composition.models.Pessoa;
import com.composition.models.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("João", false);
        Pessoa motorista = new Pessoa("Thiago", true);
        Veiculo carro = new Veiculo("Ferrary","360 Spider", "2026", "azul", "POI-4567", "RN001122",motorista);

        System.out.println(carro);
    }
}
