package com.northwindspringbootapi.repository;

import com.northwindspringbootapi.entity.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(String username);
}