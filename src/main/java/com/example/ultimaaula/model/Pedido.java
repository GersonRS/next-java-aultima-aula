package com.example.ultimaaula.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Pedido extends AbstractEntity{
  @Column
  private Date data;
  @Column
  private int quantidade;
  @Column
  private double valor;
  @OneToOne
  @JoinColumn(name = "cliente_id")
  private Cliente cliente;
  @OneToOne
  @JoinColumn(name = "produto_id")
  private Produto produto;

  public Pedido(Date data, int quantidade, double valor, Cliente cliente, Produto produto) {
    this.data = data;
    this.quantidade = quantidade;
    this.valor = valor;
    this.cliente = cliente;
    this.produto = produto;
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

  public Cliente getcliente() {
    return cliente;
  }

  public void setcliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Produto getproduto() {
    return produto;
  }

  public void setproduto(Produto produto) {
    this.produto = produto;
  }

}

