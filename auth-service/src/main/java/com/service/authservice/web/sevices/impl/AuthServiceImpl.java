package com.service.authservice.web.sevices.impl;

import com.service.authservice.model.dto.request.AuthRequest;
import com.service.authservice.model.dto.response.AuthResponse;
import com.service.authservice.web.sevices.interfaces.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class AuthServiceImpl implements AuthService {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private WebClient webClient;

    @Override
    public AuthResponse auth_login(AuthRequest authRequest) {
        webClient.get();
        return null;
    }

    @Override
    public String verifyToken(String token) {
        return null;
    }
}
