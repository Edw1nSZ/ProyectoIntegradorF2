package com.Integrador.proyecto.repository;


import com.Integrador.proyecto.datos.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private Map<Long, User> users = new HashMap<>();
    private Long currentId = 1L;

    public User createUser(User user) {
        user.setId(currentId++);
        users.put(user.getId(), user);
        return user;
    }

    public User readUser(Long id) {
        return users.get(id);
    }

    public User updateUser(Long id, User user) {
        if (users.containsKey(id)) {
            user.setId(id);
            users.put(id, user);
            return user;
        }
        return null;
    }

    public boolean deleteUser(Long id) {
        return users.remove(id) != null;
    }

    public Map<Long, User> getAllUsers() {
        return users;
    }
}
