package com.Integrador.proyecto.service;


import com.Integrador.proyecto.datos.User;
import org.springframework.stereotype.Service;
import com.Integrador.proyecto.repository.UserRepository;

import java.util.Map;


@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepository();
    }

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    public User readUser(Long id) {
        return userRepository.readUser(id);
    }

    public User updateUser(Long id, User user) {
        return userRepository.updateUser(id, user);
    }

    public boolean deleteUser(Long id) {
        return userRepository.deleteUser(id);
    }

    public Map<Long, User> getAllUsers() {
        return userRepository.getAllUsers();
    }
}
