package com.aleks.demo.controller;

import com.aleks.demo.model.Client;
import com.aleks.demo.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {

  final ClientService clientService;

  public ClientController(com.aleks.demo.service.ClientService clientService) {
    this.clientService = clientService;
  }

  //GET localhost:8080/clients/1
  @GetMapping("/clients/{id}")
  public Client findOne(@PathVariable Long id) {
    return clientService.findById(id);
  }

  //GET localhost:8080/clients
  @GetMapping("/clients")
  public Iterable<Client> findAllUsers() {
    return clientService.findAll();
  }

  //POST localhost:8080/clients
  @PostMapping("/clients")
  @ResponseStatus(HttpStatus.CREATED)
  public Client create(@RequestBody Client user) {
    return clientService.save(user);
  }

  //DELETE localhost:8080/clients/1
  @DeleteMapping("/clients/{id}")
  public void delete(@PathVariable Long id) {
    clientService.deleteById(id);
  }

  //PUT localhost:8080/clients/1
  @PutMapping("/clients/{id}")
  public Client updateUser(@PathVariable Long id, @RequestBody Client user) {
      clientService.findById(id);
      return clientService.save(user);
  }
}