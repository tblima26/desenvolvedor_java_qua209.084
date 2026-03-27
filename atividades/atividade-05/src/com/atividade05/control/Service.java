package com.atividade05.control;

import java.util.Scanner;

public class Service {
  public static Scanner sc = new Scanner(System.in);
  
  public static String lerString(String info) {
    System.out.println(info);
    String str = sc.nextLine();
    return str;
  }

  public static double lerDouble(String info) {
    System.out.println(info);
    double i = sc.nextDouble();
    return i;
  }
}
