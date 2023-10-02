package com.service.authservice.web.sevices.interfaces;

import com.service.authservice.model.dto.request.AuthRequest;
import com.service.authservice.model.dto.response.AuthResponse;

public interface AuthService {
    AuthResponse auth_login(AuthRequest authRequest);
    String verifyToken(String  token);
}
