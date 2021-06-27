package com.chirp.authservice.service;

public interface SecurityService {

    String findLoggedInUsername();
    void autoLogin(String username, String password);
}