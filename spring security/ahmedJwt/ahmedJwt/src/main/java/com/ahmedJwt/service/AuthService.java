package com.ahmedJwt.service;


import com.ahmedJwt.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}


