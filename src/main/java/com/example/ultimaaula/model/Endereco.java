package com.example.ultimaaula.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Endereco extends AbstractEntity {
  @Column
  private String rua;
  @Column
  private int numero;
  @Column
  private String cidade;
  @Column
  private String estado;

  public Endereco(){}

  public Endereco(String rua, int numero, String cidade, String estado) {
    this.rua = rua;
    this.numero = numero;
    this.cidade = cidade;
    this.estado = estado;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

}
