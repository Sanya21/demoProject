package com.aleks.demo.service;

import com.aleks.demo.model.Client;
import com.aleks.demo.repository.ClientRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ClientService {

  private final ClientRepository clientRepository;

  public ClientService(ClientRepository clientRepository) {
    this.clientRepository = clientRepository;
  }

  public Client save(Client user) {
    return clientRepository.save(user);
  }

  //use Optional.get() for unwrap optional
  @Transactional(readOnly = true)
  public Client findById(Long id) {
    final Optional<Client> byId = clientRepository.findById(id);
    Client user = byId.get();
    return user;
  }

  public void deleteById(Long id) {
    clientRepository.deleteById(id);
  }

  public Iterable<Client> findAll() {
    return clientRepository.findAll();
  }
}




