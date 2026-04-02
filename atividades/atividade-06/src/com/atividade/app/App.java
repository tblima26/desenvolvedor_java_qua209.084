package com.atividade.app;

import java.util.Scanner;

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
                
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            default:
                System.out.println("Opção inválida! Tente novamente mais tarde.");
                break;
        }

        sc.close();
    }
}
