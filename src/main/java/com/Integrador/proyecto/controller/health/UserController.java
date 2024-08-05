package com.Integrador.proyecto.controller.health;

import com.Integrador.proyecto.datos.User;
import com.Integrador.proyecto.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
@Tag(name = "prueba",description = "solo es una prueba no le pongas atencion")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "Crea usuarios")
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @Operation(summary = "Select * from")
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.readUser(id);
    }

    @Operation(summary = "Actualiza")
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @Operation(summary = "Elimina usuarios")
    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

    @Operation(summary = "Muestra cada usuario")
    @GetMapping
    public Map<Long, User> getAllUsers() {
        return userService.getAllUsers();
    }
}
