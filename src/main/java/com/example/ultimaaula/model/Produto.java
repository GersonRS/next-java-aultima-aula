package com.example.ultimaaula.model;

public class Produto {
  private String nome;
  private String descricao;
  private int codigo;
  private double valor;

  public Produto(String nome, String descricao, int codigo, double valor) {
    this.nome = nome;
    this.descricao = descricao;
    this.codigo = codigo;
    this.valor = valor;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

}
