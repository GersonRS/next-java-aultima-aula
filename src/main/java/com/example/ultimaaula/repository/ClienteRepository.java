package com.example.ultimaaula.repository;

import com.example.ultimaaula.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
  
}
