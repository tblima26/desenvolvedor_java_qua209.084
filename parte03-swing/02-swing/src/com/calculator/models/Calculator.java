package com.calculator.models;

import com.calculator.repository.InterfaceCalculator;

public class Calculator implements InterfaceCalculator {
  private double number1, number2;

  public Calculator() {
  }

  public double getNumber1() {
    return this.number1;
  }

  public void setNumber1(double number1) {
    this.number1 = number1;
  }

  public double getNumber2() {
    return this.number2;
  }

  public void setNumber2(double number2) {
    this.number2 = number2;
  }

  @Override
  public double sum(double x, double y) {
    return x + y;
  }

  @Override
  public double subtract(double x, double y) {
    return x - y;
  }

  @Override
  public double multiply(double x, double y) {
    return x * y;
  }

  @Override
  public double divde(double x, double y) {
    if (y != 0) {
      return x / y;
    }
    return 0;
  }

}
