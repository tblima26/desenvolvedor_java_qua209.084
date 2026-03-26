package com.methods.app;

import java.util.Scanner;

import com.methods.models.Aluno;
import com.methods.models.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();
        Aluno aluno = new Aluno();
        double x, y;

        prof.name = "Thiago";
        prof.subject = "Java";
        System.out.println("Aluno: ");
        aluno.name = sc.nextLine();
        
        System.out.println("Informe o valor x: ");
        x = sc.nextDouble();
        System.out.println("informe o valor y: ");
        y = sc.nextDouble();
        double result = prof.calcArea(x, y);

        System.out.println(prof.present());
        System.out.println(aluno.present());
        System.out.println("O valor da área é :"+result);

        sc.close();
    }

}
