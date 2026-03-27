package com.atividade05.app;

import com.atividade05.control.Service;
import com.atividade05.model.Aluno;
import com.atividade05.model.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        final double PI = Math.PI;
        Aluno a = new Aluno();
        a.name = Service.lerString("Nome: ");
        a.matricula = Service.lerString("Matricula: ");
        a.email = Service.lerString("Email: ");
        Professor p = new Professor();
        p.name = "Alex";
        p.matricula = "SENAI 1234";

        System.out.println(p.name + ", calcule para mim: ");
        double x = Service.lerDouble("X: ");
        double y = Service.lerDouble("y: ");
        double answer;
01
        System.out.println(p.name + ": Aluninho " + a.name);
        answer = (x * y) / 2;
        System.out.println("Area do trangulo: " + answer);
        answer = PI * (Math.pow(x, 2));
        System.out.println("Area do Circulo da base " + x + ": " + answer);
        answer = x + (2 * (x * y)) - y;
        System.out.println("A equação x+2xy-y é igual a " + answer);
    }
}
