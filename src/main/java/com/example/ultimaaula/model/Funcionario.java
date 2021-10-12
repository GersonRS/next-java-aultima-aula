package com.example.ultimaaula.model;

public class Funcionario extends Pessoa {

  private double salario;

  public Funcionario(String nome, String sobrenome, double salario) {
    super(nome, sobrenome);
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

}
