package com.swing.models;

public class Pessoa {
  private String name, cpf, phone;

  public Pessoa(String name, String cpf, String phone) {
    setName(name);
    setCpf(cpf);
    setPhone(phone);
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

}
