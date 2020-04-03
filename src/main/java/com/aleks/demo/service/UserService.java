package com.aleks.demo.service;

import com.aleks.demo.model.User;
import com.aleks.demo.repository.UserRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User save(User user) {
    return userRepository.save(user);
  }

  //use Optional.get() for unwrap optional
  public User findById(Integer id) {
    final Optional<User> byId = userRepository.findById((long) id);
    User user = byId.get();
    return user;
  }

  public User deleteById(Integer id) {
    return userRepository.deleteById(id);
  }

  public Iterable<User> findAll() {
    return userRepository.findAll();
  }
}




