package com.atividade04.app;

import java.util.Scanner;

import com.atividade04.entity.Car;

public class App {
    /**
     * TODO Faça um program aque crie um objeeto da classe veículo.
     * com os atributos:
     * - Fabricante
     * - Modelo
     * - Placa
     * - Ano 
     * - Cor
     * NOTE -  O programa deverá mostrar os dados do veículo.
     * 
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Fabricante: ");
        car.fabricante = sc.nextLine();
        System.out.println("Modelo: ");
        car.modelo = sc.nextLine();
        System.out.println("Placa: ");
        car.placa = sc.nextLine();
        System.out.println("Ano: ");
        car.ano = sc.nextInt();
        System.out.println("Cor: ");
        sc.nextLine();
        car.cor = sc.nextLine();

        System.out.println(car);
        sc.close();
    }
}
