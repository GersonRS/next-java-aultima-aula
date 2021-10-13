package com.example.ultimaaula.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Pessoa {

  @OneToOne
  @JoinColumn(name = "endereco_id")
  private Endereco endereco;

  public Cliente(String nome, String sobrenome, Endereco endereco) {
    super(nome, sobrenome);
    this.endereco = endereco;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
  
}
