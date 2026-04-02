package com.encapsulamento.models;

public class Pessoa {
  private String email;
  private String cel;

  public Pessoa(String email, String cel) {
    setCel(cel);
    setEmail(email);    
  }
  

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCel() {
    return this.cel;
  }

  public void setCel(String cel) {
    this.cel = cel;
  }

}
