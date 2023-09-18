package com.mangue.agendor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @Autowired
  private TesteRepository repository;

  @GetMapping("/")
  public String hello() {
    Teste t = new Teste();
    t.setName("teste");
    t.setDescription("teste Description");
    repository.save(t);
    return "Chupa um cu e pa";
  }

}
