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

  //name according convention
  final UserService UserService;

  public UserController(com.aleks.demo.service.UserService userService) {
    UserService = userService;
  }

  //GET localhost:8080/users/1
  @GetMapping("/users/{id}")
  public User findOne(@PathVariable /*should be long*/ Integer id) {
    return UserService.findById(id);

  }

  //GET localhost:8080/users
  @GetMapping("/users")
  public Iterable<User> findAllUsers() {
    return UserService.findAll();
  }

  //write request example
  //todo read best practices and write correct mapping
  @PostMapping("")
  @ResponseStatus(HttpStatus.CREATED)
  public User create(@RequestBody User user) {
    return UserService.save(user);
  }

  //todo read best practices and write correct mapping
  @DeleteMapping("/")
  public void delete(@PathVariable Integer id) {
    UserService.deleteById(id);
  }

  //todo read best practices and write correct mapping
  @PutMapping("/")
  public User updateUser(@RequestBody User user, @PathVariable Integer id) {
    UserService.findById(id);
    return UserService.save(user);
  }
}
