package com.chirp.chatservice.integration;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="auth-service", contextId="auth")
public interface AuthService {

}
