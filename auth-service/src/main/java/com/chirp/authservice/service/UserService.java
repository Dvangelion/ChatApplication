package com.chirp.authservice.service;

import com.chirp.authservice.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
