package com.aleks.demo.service;
import com.aleks.demo.model.User;
import com.aleks.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return userRepository.save(user);
    }


    public User findById(Integer id) {
        return userRepository.findById(id);
    }

    public User deleteById(Integer id) {
        return userRepository.deleteById(id);
    }
}




