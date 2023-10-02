package com.service.authservice.web.controllers;

import com.service.authservice.model.dto.request.AuthRequest;
import com.service.authservice.model.dto.response.ApiResponse;
import com.service.authservice.model.dto.response.AuthResponse;
import com.service.authservice.utils.ControllersUtils;
import com.service.authservice.web.sevices.interfaces.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.service.authservice.utils.ControllersUtils.LOGIN_URL;
import static com.service.authservice.utils.ControllersUtils.BASE_URL;

@RestController
@RequestMapping(BASE_URL)
@RequiredArgsConstructor
public class AuthControllers {
    private final AuthService authService;
    @PostMapping(LOGIN_URL)
    public ResponseEntity<ApiResponse<AuthResponse>> auth(@RequestBody AuthRequest authRequest) {
        ApiResponse<AuthResponse> apiResponse = new ApiResponse<>(authService.auth_login(authRequest));
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

}
