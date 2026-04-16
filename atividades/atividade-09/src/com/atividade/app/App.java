package com.atividade.app;

import javax.swing.JOptionPane;

import com.atividade.models.Combustivel;
import com.atividade.models.Pessoa;

public class App {
    /**
     * TODO Atividade 09
     * Faça um programa com JOptionPane que receba do usuario os valores dos
     * combustiveis etanol e gasolina, e exiba qual o melhor combustivel para
     * abastecer. O programa deverá mostrar a opção de entrar com o valor do
     * etanol, da gasolina e mostrar o melhor combustivel ou sair do programa.
     * 
     * NOTE
     * Para o etanol ser mais vantajoso, seu preço tem que ser até 70% do valor da
     * gasolina.
     * 
     */
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa("Alex", "(61) 98546-7800");
        String menuOptions[] = { "Gasolina", "Etanol", "Mais vantajoso", "Sair" };
        int option;
        Combustivel gasolina = new Combustivel(0);
        Combustivel etanol = new Combustivel(0);
        do {
            option = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu de Combustível",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    menuOptions,
                    menuOptions[0]);
            switch (option) {
                case 0:
                    gasolina.setPrice(Double.parseDouble(
                            JOptionPane
                                    .showInputDialog(" Sr. " + pessoa.getName() + ".\nInforme o valor da gasolina: ")
                                    .replace(",", ".")));
                    break;
                case 1:
                    etanol.setPrice(Double.parseDouble(
                            JOptionPane
                                    .showInputDialog(" Sr. " + pessoa.getName() + ".\nInforme o valor do Etanol: ")
                                    .replace(",", ".")));
                    break;
                case 2:
                    if (gasolina.getPrice() == 0) {
                        JOptionPane.showMessageDialog(null, "Gasolina não cadastrado.");
                        break;
                    }
                    if (etanol.getPrice() == 0) {
                        JOptionPane.showMessageDialog(null, "Etanol não cadastrado.");
                        break;
                    }
                    if (etanol.getPrice() <= gasolina.getPrice() * 0.7) {
                        JOptionPane.showMessageDialog(null,
                                "Sr. " + pessoa.getName() + ", o ETANOL é mais vantajoso!");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Sr. " + pessoa.getName() + ", a GASOLINA é mais vantajosa!");
                    }
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor não existente.");
                    break;
            }
        } while (option != 3);
    }
}
