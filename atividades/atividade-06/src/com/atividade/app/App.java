package com.atividade.app;

import java.util.Scanner;

import com.atividade.models.Caminhao;
import com.atividade.models.Carro;
import com.atividade.models.Onibus;
import com.atividade.models.Veiculo;

public class App {
    /**
     * TODO - Atividade 06
     * SECTION - A partir da superclasse abstrata Veiculo, crie as subclasses finais
     * Moto, Carro, Onibus e Caminhao dentro do pacote models. Na classe principal,
     * instancie cada uma dessas subclasses e solicite ao usuário que escolha um
     * veículo para preencher os seguintes dados: fabricante, modelo, cor, ano e
     * placa. O atributo privado categoria deve ser definido automaticamente pelo
     * próprio programa. Ao final, exiba as informações detalhadas do veículo
     * selecionado.
     * - Carro tera bagageiro
     * - Onibus podera ser leito ou não
     * - Caminhão tera carroceria
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção de veículo:");
        System.out.println("1 - Moto");
        System.out.println("2 - Carro");
        System.out.println("3 - Onibus");
        System.out.println("4 - Caminhao");
        System.out.print("Opção: ");
        int options = sc.nextInt();
        switch (options) {
            case 1:
                Veiculo moto = new Veiculo("CG", "200", "PRETA", "2026", "ABC1415");
                System.out.println("Moto: " + moto.getFabricante() + "\nModelo: " + moto.getModelo());
                break;
            case 2:
                Carro carro = new Carro("Fiat", "Uno", "Branco", "2022", "ABC1D23", true);
                System.out.println("Carro: " + carro.getFabricante());
                System.out.println("Modelo: " + carro.getModelo());
                System.out.println(carro.getBagageiro() ? "Tem bagageiro" : "Não tem bagageiro");
                break;
            case 3:
                Onibus onibus = new Onibus("Mercedes-Benz", "Marcopolo G7", "Prata", "2023", "BUS1A23", true);
                System.out.println("Ônibus: " + onibus.getFabricante());
                System.out.println("Modelo: " + onibus.getModelo());
                System.out.println(onibus.getLeito() ? "É leito" : "Não é leito");
                break;
            case 4:
                Caminhao caminhao = new Caminhao("Volvo", "FH 540", "Azul", "2021", "TRK9B77", true);
                System.out.println("Caminhão: " + caminhao.getFabricante());
                System.out.println("Modelo: " + caminhao.getModelo());
                System.out.println(caminhao.getCarroceria() ? "Tem leito" : "Não tem leito");
                break;
            default:
                System.out.println("Opção inválida! Tente novamente mais tarde.");
                break;
        }
        sc.close();
    }
}
