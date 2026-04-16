package com.atividade.models;

public class Pessoa {
  private String name, phone;

  public Pessoa(String name, String phone) {
    setName(name);
    setPhone(phone);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


}
