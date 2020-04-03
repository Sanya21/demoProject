package com.aleks.demo.controller;
import com.aleks.demo.model.User;
import com.aleks.demo.repository.UserRepository;
import com.aleks.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    final UserService UserService;

    public UserController(com.aleks.demo.service.UserService userService) {
        UserService = userService;
    }

    @GetMapping("/")
    public User findOne(@PathVariable Integer id) {
        return UserService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return UserService.save(user);
    }

    @DeleteMapping("/")
    public void delete(@PathVariable Integer id) {
        UserService.findById(id);
        UserService.deleteById(id);
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user, @PathVariable Integer id) {
        UserService.findById(id);
        return UserService.save(user);
    }
}
