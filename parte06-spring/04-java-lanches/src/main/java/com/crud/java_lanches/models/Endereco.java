package com.crud.java_lanches.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Endereco {
  private static long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @Column(nullable = false)
  private String cep;
  @Column(nullable = false)
  private String uf;
  @Column(nullable = false)
  private String city;
  @Column(nullable = false)
  private String adress;
  @Column(nullable = false)
  private String logradouro;
  @Column(nullable = false)
  private String number;
  @Column(length = 255)
  private String complement;

  @ManyToMany(mappedBy = "enderecos")
  private List<Cliente> clientes = new ArrayList<>();
}
