package com.construtor.model;

public class Pessoa {
  private String name;
  private String cpf;
  private String phone;
  private int age;

  public Pessoa(String name, String cpf, String phone, int age) {
    setName(name);
    setCpf(cpf);
    setPhone(phone);
    setAge(age);
  }

  public Pessoa(String name, String phone) {
    setName(name);
    setPhone(phone);
  }

  public Pessoa() {
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{")
      .append("name='").append(name).append('\'')
      .append(", cpf='").append(cpf).append('\'')
      .append(", phone='").append(phone).append('\'')
      .append(", age=").append(age)
      .append('}');
    return sb.toString();
  }
}
