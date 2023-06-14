package com.manthan.finlife.auth.services;

import com.manthan.finlife.auth.interfaces.AuthService;
import com.manthan.finlife.auth.interfaces.UserLoginRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    public String login(UserLoginRequest request){
        return null;
    }
}
