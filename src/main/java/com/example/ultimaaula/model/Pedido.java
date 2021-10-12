package com.example.ultimaaula.model;

import java.util.Date;

public class Pedido {
  private Date data;
  private int quantidade;
  private double valor;
  private Cliente varCliente;
  private Produto varProduto;

  public Pedido(Date data, int quantidade, double valor, Cliente varCliente, Produto varProduto) {
    this.data = data;
    this.quantidade = quantidade;
    this.valor = valor;
    this.varCliente = varCliente;
    this.varProduto = varProduto;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public Cliente getVarCliente() {
    return varCliente;
  }

  public void setVarCliente(Cliente varCliente) {
    this.varCliente = varCliente;
  }

  public Produto getVarProduto() {
    return varProduto;
  }

  public void setVarProduto(Produto varProduto) {
    this.varProduto = varProduto;
  }

}
