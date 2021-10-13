package com.example.ultimaaula.controller;

import java.util.Optional;

import com.example.ultimaaula.model.Cliente;
import com.example.ultimaaula.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Clientecontroller {

  @Autowired
  private ClienteRepository clienteRepository;

  @GetMapping("/cliente/{varID}")
  public Optional<Cliente> buscaClientePorID(@PathVariable("varID") Long id) {
    return clienteRepository.findById(id);
  }

  @PostMapping("/cliente")
  public Cliente salvar(@RequestBody Cliente cliente) {
    return clienteRepository.save(cliente);
  }
}
