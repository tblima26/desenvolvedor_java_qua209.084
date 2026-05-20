package com.crud.java_lanches.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
public class Cliente {
  private long id;
  private String name;
  private String email;
  private String phone;
  private LocalDate bornDate;
  

}
