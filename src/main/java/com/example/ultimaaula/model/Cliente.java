package com.example.ultimaaula.model;

public class Cliente extends Pessoa {

  private Endereco endereco;

  public Cliente(String nome, String sobrenome) {
    super(nome, sobrenome);
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }
  
}
