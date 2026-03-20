package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        /**
         * ANCHOR - Programa
         * Receba do usuario o nome e a idade.
         * Exibir uma lista de salas de cinema e seus respectivos filmes.
         * Sala 1 - A roda quadrada (Livre)
         * Sala 2 - A volta dos que nao foram (12 anos)
         * Sala 3 - Poeira em alto mar (14 anos)
         * Sala 4 - As tranças do rei careca (16 anos)
         * Sala 5 - A vingança do Peixe frito (18 anos)
         * O usuario devera escolher o filme desejado. Se tiver a idade minima para ver
         * o filme, o programa imprime o ingreço e encerra.
         * Se o usuario não tiver a idade minima, o programa bloqueia a entrada e
         * reexibe a lista de filmes para o usuário escolher outro filme.
         * 
         */
        System.out.println("--- Cinemar ---");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Idade: ");
        int age = sc.nextInt();
        int options = 0;
        String answer;
        boolean validMovie = false;

        do {

            System.out.println("--- Cinemark ---");
            System.out.println("Sala 1 - A Roda Quadrada");
            System.out.println("Sala 2 - A  Volta dos que não foram.");
            System.out.println("Sala 3 - Poeira em alto mar.");
            System.out.println("Sala 4 - As tranças do rei careca. ");
            System.out.println("Sala 5 - A Vingança do peix frito. ");
            System.out.println("Opção: ");
            options = sc.nextInt();

            switch (options) {
                case 1:
                    validMovie = true;
                    answer = "Ótima escolha! Bom filme";
                    break;
                case 2:
                    validMovie = (age >= 12) ? true : false;
                    answer = (validMovie == true) ? "Ótima escolha! Bom filme"
                            : "Idade não permitida! Escolher outro filme.";
                    break;
                case 3:
                    validMovie = (age >= 14) ? true : false;
                    answer = (validMovie == true) ? "Ótima escolha! Bom filme"
                            : "Idade não permitida! Escolher outro filme.";

                    break;
                case 4:
                    validMovie = (age >= 16) ? true : false;
                    answer = (validMovie == true) ? "Ótima escolha! Bom filme"
                            : "Idade não permitida! Escolher outro filme.";

                    break;
                case 5:
                    validMovie = (age >= 18) ? true : false;
                    answer = (validMovie == true) ? "Ótima escolha! Bom filme"
                            : "Idade não permitida! Escolher outro filme.";
                    break;
                default:
                    answer = "Escolha um valor referente ao filme desejado.";
                    break;
            }
            if (!validMovie)
                System.out.println(answer);
        } while (validMovie == false);
        System.out.println(name + ", é uma boa escolha!");
        System.out.println(answer);
        sc.close();
    }
}
