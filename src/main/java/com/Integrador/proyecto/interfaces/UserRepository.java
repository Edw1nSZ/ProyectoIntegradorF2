package com.Integrador.proyecto.interfaces;

import com.Integrador.proyecto.datos.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
