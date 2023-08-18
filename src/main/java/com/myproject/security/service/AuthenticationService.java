package com.myproject.security.service;

import com.myproject.security.dao.request.SignUpRequest;
import com.myproject.security.dao.request.SigninRequest;
import com.myproject.security.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
