package com.aleks.demo.controller;

import com.aleks.demo.model.User;
import com.aleks.demo.service.UserService;
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
public class UserController {

  final UserService userService;

  public UserController(com.aleks.demo.service.UserService userService) {
    this.userService = userService;
  }

  //GET localhost:8080/users/1
  @GetMapping("/users/{id}")
  public User findOne(@PathVariable Long id) {
    return userService.findById(id);
  }

  //GET localhost:8080/users
  @GetMapping("/users")
  public Iterable<User> findAllUsers() {
    return userService.findAll();
  }

  //POST localhost:8080/users
  @PostMapping("/users")
  @ResponseStatus(HttpStatus.CREATED)
  public User create(@RequestBody User user) {
    return userService.save(user);
  }

  //POST localhost:8080/users/1
  @DeleteMapping("/users/{id}")
  public void delete(@PathVariable Long id) {
    userService.deleteById(id);
  }

  //POST localhost:8080/users/1
  @PutMapping("/users/{id}")
  public User updateUser( @PathVariable Long id,@RequestBody User user) {
      userService.findById(id);
      return userService.save(user);
  }
}